/**
 * Author: Mohamed Zarrouki
 */
package org.gemini.it.excel.helper.writer;

public interface CellCommentCondition {
    <T> String applyCondition(T fieldValue);
}
