/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import ExcelLoom.excel.enums.ImageType;

/**
 * When the field is an image data,
 * the Field should be of type byte[]
 *
 * <pre>{@code
 * public class Product {
 *     @ExcelColumn(name = "Product Photo")
 *     @Image(extension = ImageType.PICTURE_TYPE_PNG, width = 100, height = 100)
 *     private byte[] photo;
 * }
 * }</pre>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Image {
    ImageType extension() default ImageType.PICTURE_TYPE_JPEG;
    int width() default 200;
    int height() default 200;
}
