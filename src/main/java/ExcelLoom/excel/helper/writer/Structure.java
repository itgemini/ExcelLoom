/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.helper.writer;

import java.util.function.BiConsumer;

import org.apache.poi.ss.usermodel.Cell;

public record Structure(String name, Integer order, BiConsumer<Cell,Object> processor) {}
