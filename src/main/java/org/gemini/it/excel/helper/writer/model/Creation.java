/**
 * Author: Mohamed Zarrouki
 */
package org.gemini.it.excel.helper.writer.model;

import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Workbook;

abstract class Creation {
    protected CreationHelper factory;
    Creation(Workbook workbook){
        factory = workbook.getCreationHelper();
    }
}
