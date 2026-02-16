/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to mark a field as a reference to a parent entity.
 *
 * <pre>{@code
 * @Sheet(name = "Child")
 * public static class ChildEntity {
 *     @ExcelColumn(name = "Child ID")
 *     private int id;
 *     @Parent(reference = "id")
 *     @ExcelColumn(name = "Parent ID")
 *     private int parentId;
 * }
 * }</pre>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Parent {
    /**
     * Specifies the field name in the parent entity that this field references.
     */
    String reference();
}
