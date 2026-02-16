/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.enums;


/**
 * The ImageType enumeration defines a set of constants representing various image types
 * that can be used in applications requiring support for multimedia or graphical content.
 *
 * Each constant in this enumeration is associated with an integer type index.
 *
 * Available image types:
 * - PICTURE_TYPE_EMF: Represents an Enhanced Metafile (EMF) image type.
 * - PICTURE_TYPE_WMF: Represents a Windows Metafile (WMF) image type.
 * - PICTURE_TYPE_PICT: Represents a Macintosh Picture (PICT) image type.
 * - PICTURE_TYPE_JPEG: Represents a JPEG image type.
 * - PICTURE_TYPE_PNG: Represents a Portable Network Graphics (PNG) image type.
 * - PICTURE_TYPE_DIB: Represents a Device-Independent Bitmap (DIB) image type.
 *
 * The type index values for these image types can be retrieved using the `getTypeIndex()` method.
 */
public enum ImageType {
    PICTURE_TYPE_EMF(2),
    PICTURE_TYPE_WMF(3),
    PICTURE_TYPE_PICT(4),
    PICTURE_TYPE_JPEG(5),
    PICTURE_TYPE_PNG(6),
    PICTURE_TYPE_DIB(7);

    private final int typeIndex;
    ImageType(int typeIndex) {
        this.typeIndex=typeIndex;
    }

    public int getTypeIndex(){return typeIndex;}
}
