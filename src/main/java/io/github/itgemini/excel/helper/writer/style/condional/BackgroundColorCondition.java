/**
 * Author: Mohamed Zarrouki
 */
package io.github.itgemini.excel.helper.writer.style.condional;


import io.github.itgemini.excel.enums.Color;

public interface BackgroundColorCondition {
    <T> Color applyCondition(T fieldValue);
}
