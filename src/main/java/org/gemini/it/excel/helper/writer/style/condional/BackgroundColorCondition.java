/**
 * Author: Mohamed Zarrouki
 */
package org.gemini.it.excel.helper.writer.style.condional;


import org.gemini.it.excel.enums.Color;

public interface BackgroundColorCondition {
    <T> Color applyCondition(T fieldValue);
}
