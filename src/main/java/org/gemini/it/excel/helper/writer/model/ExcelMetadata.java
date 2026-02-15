package org.gemini.it.excel.helper.writer.model;

import java.util.List;
import java.util.function.Function;

import org.gemini.it.excel.annotation.ExcelColumn;
import org.gemini.it.excel.annotation.Image;
import org.gemini.it.excel.annotation.ValidationComment;
import org.gemini.it.excel.annotation.ValidationStatus;
import org.gemini.it.excel.annotation.style.ConditionalExcelCellStyle;
import org.gemini.it.excel.annotation.style.ExcelStyle;


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
