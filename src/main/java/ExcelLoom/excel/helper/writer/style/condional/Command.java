/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.helper.writer.style.condional;

import java.io.Serializable;

@FunctionalInterface
public interface Command extends Serializable {
   void execute();
}