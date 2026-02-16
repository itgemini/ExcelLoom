/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import ExcelLoom.excel.helper.writer.CellCommentCondition;


/**
 * Annotation to specify a validation comment condition for an Excel column.
 * This can be used to dynamically add comments to cells based on their value.
 *
 * <pre>{@code
 * @Sheet(name = "ImportData")
 * public static class ImportEntity {
 *     @ExcelColumn(name = "Email")
 *     @ValidationComment(comment = EmailErrorComment.class)
 *     private String email;
 * }
 *
 * public static class EmailErrorComment implements CellCommentCondition {
 *     @Override
 *     public <T> String applyCondition(T fieldValue) {
 *         String email = (String) fieldValue;
 *         return (email != null && email.contains("@")) ? "" : "Invalid email format";
 *     }
 * }
 * }</pre>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ValidationComment {
    /**
     * Specifies the comment information for the Excel column based on a condition.
     * @return The comment information for the column.
     */
    Class<? extends CellCommentCondition> comment();
}
