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
 * Annotation to define properties for embedding or referencing a picture in an Excel sheet.
 * This annotation provides attributes for specifying the image type, file path,
 * and the position of the picture within the sheet.
 *
 * Applicable to other annotations that represent Excel-specific configurations or behaviors.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Picture {
    /**
     * Specifies the image file format for embedding or referencing a picture.
     * The default image type is JPEG.
     *
     * @return The {@link ImageType} representing the file format of the image.
     */
    ImageType extension() default ImageType.PICTURE_TYPE_JPEG;
    /**
     * Specifies the file path for the image to be embedded or referenced in an Excel sheet.
     * This attribute is used to define the location of the image file that should be processed.
     *
     * @return The file path of the image as a string.
     */
    String path();
    /**
     * Specifies the starting column index for an image in an Excel sheet.
     * The column index is zero-based, meaning the first column corresponds to an index of 0.
     *
     * @return The zero-based index of the starting column.
     */
    int startColumn();
    /**
     * Specifies the starting row index for embedding or referencing a picture
     * in an Excel sheet. This determines the topmost position of the picture
     * within the sheet. The index is zero-based, meaning the first row has
     * an index of 0.
     *
     * @return The zero-based index representing the starting row for the picture.
     */
    int startRow();
    /**
     * Specifies the ending column index for an image or cell in the Excel sheet.
     * This property is used when defining a range for the placement or spanning of an element
     * within the sheet. The index is zero-based, meaning the first column corresponds to an index of 0.
     *
     * @return The zero-based index of the ending column.
     */
    int endColumn();
    /**
     * Defines the ending row index for positioning or referencing a picture
     * within an Excel sheet. This value is zero-based, meaning the first row
     * has an index of 0. It specifies the lower boundary in scenarios where
     * the picture spans multiple rows.
     *
     * @return The zero-based index of the ending row.
     */
    int endRow();
}
