/**
 * Author: Mohamed Zarrouki
 */
package org.gemini.it.excel.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.gemini.it.excel.annotation.style.ExcelStyle;
import org.gemini.it.excel.annotation.style.Font;
import org.gemini.it.excel.enums.Color;


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
     * use {@link org.gemini.it.excel.enums.PercentageFormat} {@link org.gemini.it.excel.enums.DateFormat} {@link org.gemini.it.excel.enums.CurrencyFormat} to specify the format.
     */
    String format() default "";

    ExcelStyle headerStyle() default @ExcelStyle(font = @Font(color = Color.BLACK,fontHeightInPoints = 11),backgroundColor = Color.WHITE,patternType = FillPatternType.NO_FILL);
}
