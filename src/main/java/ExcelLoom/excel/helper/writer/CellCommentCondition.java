/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.helper.writer;

public interface CellCommentCondition {
    <T> String applyCondition(T fieldValue);
}
