/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.enums;


/**
 * The DateFormat class provides a collection of predefined string constants
 * that represent various date and time formatting patterns. These formats
 * can be used to standardize the display of dates and times across applications.
 *
 * This class is non-instantiable and serves as a utility container for these
 * string constants.
 *
 * Available formatting constants include:
 * - FULL_DATE_TIME: Provides a formatted string representing both date and time
 *   with the full month name and an AM/PM indicator.
 * - SHORT_DATE: Represents a short date format with month, day, and year in numerical form.
 * - MEDIUM_DATE: Includes a medium level format with abbreviated month name and full year.
 * - LONG_DATE: Represents a long format with the full name of the month.
 * - FULL_DATE: Includes the full date with day of the week and full month name.
 * - SHORT_TIME: Provides a short time format with an AM/PM indicator.
 * - MEDIUM_TIME: Includes time with seconds and an AM/PM indicator.
 * - ISO_DATE: Represents a date format in ISO standard (yyyy-MM-dd).
 * - ISO_TIME: Represents a time format in ISO standard (HH:mm:ss).
 * - ISO_DATE_TIME: Represents a combined date and time format in ISO standard.
 */
public class DateFormat {
    private DateFormat() {}
    public static final String FULL_DATE_TIME = "dddd, MMMM d, yyyy h:mm AM/PM";
    public static final String SHORT_DATE = "M/d/yy";
    public static final String MEDIUM_DATE = "MMM d, yyyy";
    public static final String LONG_DATE = "MMMM d, yyyy";
    public static final String FULL_DATE = "dddd, MMMM d, yyyy";
    public static final String SHORT_TIME = "h:mm AM/PM";
    public static final String MEDIUM_TIME = "h:mm:ss AM/PM";
    public static final String ISO_DATE = "yyyy-MM-dd";
    public static final String ISO_TIME = "HH:mm:ss";
    public static final String ISO_DATE_TIME = "yyyy-MM-dd'T'HH:mm:ss";
}
