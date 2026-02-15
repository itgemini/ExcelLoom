package io.github.itgemini.excel.helper.writer.model;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

import org.apache.commons.lang3.StringUtils;
import io.github.itgemini.excel.annotation.Child;
import io.github.itgemini.excel.annotation.ExcelColumn;
import io.github.itgemini.excel.annotation.Image;
import io.github.itgemini.excel.annotation.ValidationComment;
import io.github.itgemini.excel.annotation.ValidationStatus;
import io.github.itgemini.excel.annotation.style.ConditionalExcelCellStyle;
import io.github.itgemini.excel.annotation.style.ExcelStyle;

public class ExcelMetadataCache {
    private static final Map<Class<?>, ExcelMetadata> CACHE = new ConcurrentHashMap<>();

    public static ExcelMetadata getMetadata(Class<?> clazz) {
        return CACHE.computeIfAbsent(clazz, ExcelMetadataCache::parseMetadata);
    }

    private static ExcelMetadata parseMetadata(Class<?> clazz) {
        List<FieldMetadata> columns = new ArrayList<>();
        List<ChildMetadata> children = new ArrayList<>();

        Field[] fields = clazz.getDeclaredFields();
        int defaultOrder = 0;

        for (Field field : fields) {
            field.setAccessible(true);
            Function<Object, Object> getter = obj -> {
                try {
                    return field.get(obj);
                }
                catch (IllegalAccessException e) {
                    throw new RuntimeException("Failed to access field: " + field.getName(), e);
                }
            };

            if (field.isAnnotationPresent(ExcelColumn.class)) {
                ExcelColumn column = field.getAnnotation(ExcelColumn.class);
                int order = column.position() == 0 ? defaultOrder++ : column.position();
                columns.add(new FieldMetadata(
                        field.getName(),
                        order,
                        StringUtils.isBlank(column.name()) ? field.getName() : column.name(),
                        getter,
                        column,
                        field.getAnnotation(ExcelStyle.class),
                        field.getAnnotation(Image.class),
                        field.getAnnotation(ConditionalExcelCellStyle.class),
                        field.getAnnotation(ValidationStatus.class),
                        field.getAnnotation(ValidationComment.class)
                ));
            }

            if (field.isAnnotationPresent(Child.class)) {
                Child child = field.getAnnotation(Child.class);
                children.add(new ChildMetadata(
                        field.getName(),
                        child.mappedBy(),
                        child.referencedBy(),
                        getter
                ));
            }
        }

        return new ExcelMetadata(clazz, columns, children);
    }
}
