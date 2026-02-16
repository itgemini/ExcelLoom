/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.helper.writer;

import java.util.function.BiConsumer;

import org.apache.poi.ss.usermodel.Cell;

public record Conditional(String name, BiConsumer<Cell,Object> processor) {
}
