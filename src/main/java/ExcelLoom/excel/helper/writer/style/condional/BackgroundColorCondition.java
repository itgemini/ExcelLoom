/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.helper.writer.style.condional;


import ExcelLoom.excel.enums.Color;

public interface BackgroundColorCondition {
    <T> Color applyCondition(T fieldValue);
}
