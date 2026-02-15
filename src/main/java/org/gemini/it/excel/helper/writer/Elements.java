/**
 * Author: Mohamed Zarrouki
 */
package org.gemini.it.excel.helper.writer;

import java.util.List;

import org.gemini.it.excel.helper.Children;

public record Elements(List<Structure> structures, List<Children> children, List<Conditional> conditional,
                       int headerRow) {
}
