/**
 * Author: Mohamed Zarrouki
 */
package io.github.itgemini.excel.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import io.github.itgemini.excel.enums.ImageType;

/**
 * When the field is an image data,
 * the Field should be of type byte[]
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Image {
    ImageType extension() default ImageType.PICTURE_TYPE_JPEG;
    int width() default 200;
    int height() default 200;
}
