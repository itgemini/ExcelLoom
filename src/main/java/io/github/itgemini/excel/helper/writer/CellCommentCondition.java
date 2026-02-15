/**
 * Author: Mohamed Zarrouki
 */
package io.github.itgemini.excel.helper.writer;

public interface CellCommentCondition {
    <T> String applyCondition(T fieldValue);
}
