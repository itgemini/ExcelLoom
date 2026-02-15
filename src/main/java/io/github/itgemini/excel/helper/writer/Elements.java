/**
 * Author: Mohamed Zarrouki
 */
package io.github.itgemini.excel.helper.writer;

import java.util.List;

import io.github.itgemini.excel.helper.Children;

public record Elements(List<Structure> structures, List<Children> children, List<Conditional> conditional,
                       int headerRow) {
}
