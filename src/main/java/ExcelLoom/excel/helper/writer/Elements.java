/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.helper.writer;

import java.util.List;

import ExcelLoom.excel.helper.Children;

public record Elements(List<Structure> structures, List<Children> children, List<Conditional> conditional,
                       int headerRow) {
}
