/**
 * Author: Mohamed Zarrouki
 */
package io.github.itgemini.excel.helper.writer.style.condional;

import io.github.itgemini.excel.enums.Status;

public interface DataStatusCondition {
    <T> Status applyCondition(T fieldValue);
}
