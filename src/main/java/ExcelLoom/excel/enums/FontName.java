/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.enums;


/**
 * The FontName enumeration defines a set of commonly used font names.
 *
 * Each constant represents the name of a specific font style in textual format.
 * This can be used for styling and formatting purposes in applications that
 * require font customization, such as document processing, UI design, or
 * reporting systems.
 */
public enum FontName {
    ARIAL("Arial"),
    TIMES_NEW_ROMAN("Times New Roman"),
    CALIBRI("Calibri"),
    VERDANA("Verdana"),
    COURIER_NEW("Courier New"),
    TAHOMA("Tahoma"),
    LUCIDA_SANS_UNICODE("Lucida Sans Unicode"),
    GEORGIA("Georgia"),
    GARAMOND("Garamond"),
    TREBUCHET_MS("Trebuchet MS"),
    COMIC_SANS_MS("Comic Sans MS"),
    IMPACT("Impact"),
    BOOKMAN_OLD_STYLE("Bookman Old Style"),
    PALATINO_LINOTYPE("Palatino Linotype"),
    AVENIR("Avenir"),
    HELVETICA("Helvetica");

    private final String name;

    FontName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
