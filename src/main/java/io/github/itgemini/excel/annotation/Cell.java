/**
 * Author: Mohamed Zarrouki
 */
package io.github.itgemini.excel.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import io.github.itgemini.excel.enums.CurrencyFormat;
import io.github.itgemini.excel.enums.DateFormat;
import io.github.itgemini.excel.enums.PercentageFormat;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Cell {
    int row() default 0;
    int column() default 0;
    int firstRow() default 0;
    int lastRow() default 0;
    int firstColumn() default 0;
    int lastColumn() default 0;
    /**
     * Specifies the format of the column in the Excel sheet.
     * use {@link PercentageFormat} {@link DateFormat}
     * {@link CurrencyFormat} to specify the format.
     */
    String format() default "";
}
