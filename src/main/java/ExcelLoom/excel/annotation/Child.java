/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to define a child relationship between fields.
 * This is used in scenarios where one field is considered a child of another,
 * providing references for object relationships.
 *
 * <pre>{@code
 * @Sheet(name = "Parent")
 * public static class ParentEntity {
 *     @ExcelColumn(name = "Parent ID")
 *     private int id;
 *     @ExcelColumn(name = "Parent Name")
 *     private String name;
 *     @Child(mappedBy = ChildEntity.class, referencedBy = "parentId")
 *     private List<ChildEntity> children;
 * }
 * }</pre>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Child {
    /**
     * Specifies the class that defines the mapping for the child relationship.
     * This is typically used to indicate the parent class or entity that holds the
     * reference to the current field.
     *
     * @return The class type that defines the mapped relationship.
     */
    Class<?> mappedBy();
    /**
     * Specifies the name of the field in the child entity that references
     * the parent entity. This is typically used to establish a relationship
     * where the child entity contains a foreign key or reference to the parent 
     * entity's identifier.
     *
     * @return The name of the field in the child entity that serves as the reference.
     */
    String referencedBy();
}
