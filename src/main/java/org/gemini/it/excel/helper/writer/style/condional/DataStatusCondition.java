/**
 * Author: Mohamed Zarrouki
 */
package org.gemini.it.excel.helper.writer.style.condional;

import org.gemini.it.excel.enums.Status;

public interface DataStatusCondition {
    <T> Status applyCondition(T fieldValue);
}
