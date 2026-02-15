/**
 * Author: Mohamed Zarrouki
 */
package org.gemini.it.excel.helper.writer;

import java.util.function.BiConsumer;

import org.apache.poi.ss.usermodel.Cell;

public record Structure(String name, Integer order, BiConsumer<Cell,Object> processor) {}
