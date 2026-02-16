/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.helper.writer.style.condional;

import ExcelLoom.excel.enums.Status;

public interface DataStatusCondition {
    <T> Status applyCondition(T fieldValue);
}
