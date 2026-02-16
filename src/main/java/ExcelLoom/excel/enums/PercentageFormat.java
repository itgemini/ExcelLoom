/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.enums;


/**
 * The PercentageFormat class provides a collection of predefined string constants
 * that represent formatting patterns for displaying percentages. These formats
 * can be used to standardize the representation of percentage values in applications.
 *
 * This class is non-instantiable and serves as a utility container for these
 * string constants.
 *
 * Available formatting constants include:
 * - PERCENTAGE: Represents a whole number percentage format (e.g., "75%").
 * - PERCENTAGE_WITH_DECIMALS: Includes decimal precision for percentages (e.g., "75.25%").
 */
public class PercentageFormat {
    private PercentageFormat() {}
    public static final String PERCENTAGE = "#%";
    public static final String PERCENTAGE_WITH_DECIMALS = "#.##%";
}