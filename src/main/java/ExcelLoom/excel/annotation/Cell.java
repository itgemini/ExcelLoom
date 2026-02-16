/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import ExcelLoom.excel.enums.CurrencyFormat;
import ExcelLoom.excel.enums.DateFormat;
import ExcelLoom.excel.enums.PercentageFormat;

/**
 * Annotation to define a cell in an Excel sheet with specific properties such as
 * row, column, formatting, and ranges for merging or spanning cells.
 *
 * <pre>{@code
 * @Sheet(name = "Report")
 * public class ReportHeader {
 *     @Cell(row = 0, column = 0)
 *     private String title = "Monthly Sales Report";
 *
 *     @Cell(row = 1, column = 0)
 *     private String date = "2024-01-01";
 * }
 * }</pre>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Cell {
    /**
     * Specifies the row of the cell in an Excel sheet.
     * @return The zero-based index representing the row. Default is 0.
     */
    int row() default 0;
    /**
     * Specifies the column position in an Excel sheet.
     *
     * @return The zero-based index of the column position. Default is 0.
     */
    int column() default 0;
    /**
     * Specifies the starting row index in a range or section of an Excel sheet.
     * This value is zero-based, meaning the first row has an index of 0.
     * It is used to define the starting boundary of a range to be processed or formatted.
     *
     * @return The zero-based index of the starting row.
     */
    int firstRow() default 0;
    /**
     * Specifies the index of the last row for a cell in an Excel sheet.
     * This value is used in scenarios where cells span multiple rows.
     * The index is zero-based, meaning that the first row has an index of 0,
     * the second row has an index of 1, and so on.
     *
     * @return The index of the last row. Defaults to 0 if not specified.
     */
    int lastRow() default 0;
    /**
     * Specifies the first column index for an Excel cell.
     * This attribute is typically used when defining a range of columns in which a cell spans.
     * The index is zero-based, meaning the first column in the Excel sheet corresponds to an index of 0.
     *
     * @return The zero-based index of the first column.
     */
    int firstColumn() default 0;
    /**
     * Specifies the index of the last column in a range of columns for an Excel cell.
     * This is used to define the ending column for merged or spanned cells.
     * The index is zero-based, meaning the first column has an index of 0, the second column has an index of 1, and so on.
     *
     * @return The zero-based index of the last column in the range. Defaults to 0.
     */
    int lastColumn() default 0;
    /**
     * Specifies the format of the column in the Excel sheet.
     * use {@link PercentageFormat} {@link DateFormat}
     * {@link CurrencyFormat} to specify the format.
     */
    String format() default "";
}
