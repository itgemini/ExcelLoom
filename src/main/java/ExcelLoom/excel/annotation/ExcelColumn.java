/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.apache.poi.ss.usermodel.FillPatternType;
import ExcelLoom.excel.annotation.style.ExcelStyle;
import ExcelLoom.excel.annotation.style.Font;
import ExcelLoom.excel.enums.Color;
import ExcelLoom.excel.enums.CurrencyFormat;
import ExcelLoom.excel.enums.DateFormat;
import ExcelLoom.excel.enums.PercentageFormat;


/**
 * Annotation to mark a field as a column in an Excel sheet.
 *
 * <pre>{@code
 * public class User {
 *     @ExcelColumn(name = "User Name", position = 0)
 *     private String name;
 *
 *     @ExcelColumn(name = "Age", position = 1)
 *     private int age;
 * }
 * }</pre>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ExcelColumn {
    /**
     * Specifies the name of the Excel column.
     */
    String name() default "";

    /**
     * Specifies the starting position of the column in the Excel sheet.
     */
    int position() default 0;

    /**
     * Specifies the format of the column in the Excel sheet.
     * use {@link PercentageFormat} {@link DateFormat} {@link CurrencyFormat} to specify the format.
     */
    String format() default "";

    ExcelStyle headerStyle() default @ExcelStyle(font = @Font(color = Color.BLACK,fontHeightInPoints = 11),backgroundColor = Color.WHITE,patternType = FillPatternType.NO_FILL);
}
