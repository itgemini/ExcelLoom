/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.enums;


/**
 * The FontStyle enumeration defines a collection of common font styles
 * that can be used for text formatting and styling in an application.
 *
 * Each font style is associated with a descriptive string value that
 * represents the style name.
 *
 * Available font styles:
 * - NORMAL: Standard, unformatted text style.
 * - BOLD: Bold text style for emphasizing text.
 * - ITALIC: Italic text style for emphasizing or distinguishing text.
 * - UNDERLINE: Underlined text style for highlighting information.
 * - STRIKETHROUGH: Strike-through text style for indicating deletions or irrelevance.
 * - DOUBLE_UNDERLINE: Double underlined text style for further emphasis.
 */
public enum FontStyle {
    NORMAL("Normal"),
    BOLD("Bold"),
    ITALIC("Italic"),
    UNDERLINE("Underline"),
    STRIKETHROUGH("Strikethrough"),
    DOUBLE_UNDERLINE("DoubleUnderline");
    private final String value;

    FontStyle(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }
}
