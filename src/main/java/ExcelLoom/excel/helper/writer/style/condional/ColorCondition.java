/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.helper.writer.style.condional;


import ExcelLoom.excel.enums.Color;

public interface ColorCondition {
    <T> Color applyCondition(T fieldValue);
}
