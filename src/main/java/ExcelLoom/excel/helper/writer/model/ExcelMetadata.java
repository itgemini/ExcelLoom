package ExcelLoom.excel.helper.writer.model;

import java.util.List;
import java.util.function.Function;

import ExcelLoom.excel.annotation.ExcelColumn;
import ExcelLoom.excel.annotation.Image;
import ExcelLoom.excel.annotation.ValidationComment;
import ExcelLoom.excel.annotation.ValidationStatus;
import ExcelLoom.excel.annotation.style.ConditionalExcelCellStyle;
import ExcelLoom.excel.annotation.style.ExcelStyle;


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
