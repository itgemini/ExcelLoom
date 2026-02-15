/**
 * Author: Mohamed Zarrouki
 */
package org.gemini.it.excel.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

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
     * use {@link org.gemini.it.excel.enums.PercentageFormat} {@link org.gemini.it.excel.enums.DateFormat}
     * {@link org.gemini.it.excel.enums.CurrencyFormat} to specify the format.
     */
    String format() default "";
}
