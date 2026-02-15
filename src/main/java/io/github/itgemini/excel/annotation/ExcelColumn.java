/**
 * Author: Mohamed Zarrouki
 */
package io.github.itgemini.excel.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.apache.poi.ss.usermodel.FillPatternType;
import io.github.itgemini.excel.annotation.style.ExcelStyle;
import io.github.itgemini.excel.annotation.style.Font;
import io.github.itgemini.excel.enums.Color;
import io.github.itgemini.excel.enums.CurrencyFormat;
import io.github.itgemini.excel.enums.DateFormat;
import io.github.itgemini.excel.enums.PercentageFormat;


/**
 * Annotation to mark a field as a column in an Excel sheet.
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
