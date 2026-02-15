package io.github.itgemini.excel.helper.writer.model;

import java.util.List;
import java.util.function.Function;

import io.github.itgemini.excel.annotation.ExcelColumn;
import io.github.itgemini.excel.annotation.Image;
import io.github.itgemini.excel.annotation.ValidationComment;
import io.github.itgemini.excel.annotation.ValidationStatus;
import io.github.itgemini.excel.annotation.style.ConditionalExcelCellStyle;
import io.github.itgemini.excel.annotation.style.ExcelStyle;


public record ExcelMetadata(
        Class<?> entityClass,
        List<FieldMetadata> columns,
        List<ChildMetadata> children
) {
}

record FieldMetadata(
        String fieldName,
        int order,
        String columnName,
        Function<Object, Object> getter,
        ExcelColumn columnAnnotation,
        ExcelStyle styleAnnotation,
        Image imageAnnotation,
        ConditionalExcelCellStyle conditionalStyleAnnotation,
        ValidationStatus validationStatusAnnotation,
        ValidationComment validationCommentAnnotation
) {
}

record ChildMetadata(
        String fieldName,
        Class<?> mappedBy,
        String referencedBy,
        Function<Object, Object> getter
) {
}
