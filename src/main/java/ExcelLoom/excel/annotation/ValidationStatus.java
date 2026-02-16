/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import ExcelLoom.excel.helper.writer.style.condional.DataStatusCondition;


/**
 * Annotation to specify a validation status condition for an Excel column.
 * This can be used to dynamically change the cell's background color based on its value.
 *
 * <pre>{@code
 * @Sheet(name = "ImportData")
 * public static class ImportEntity {
 *     @ExcelColumn(name = "Email")
 *     @ValidationStatus(status = EmailValidator.class)
 *     private String email;
 * }
 *
 * public static class EmailValidator implements DataStatusCondition {
 *     @Override
 *     public <T> Status applyCondition(T fieldValue) {
 *         String email = (String) fieldValue;
 *         return (email != null && email.contains("@")) ? Status.SUCCESS : Status.ERROR;
 *     }
 * }
 * }</pre>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ValidationStatus {
    /**
     * Specifies the status information for the Excel column based on a condition.
     * @return The status information for the column.
     */
    Class<? extends DataStatusCondition> status();
}
