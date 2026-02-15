/**
 * Author: Mohamed Zarrouki
 */
package org.gemini.it.excel.helper.writer.style.condional;

import java.io.Serializable;

@FunctionalInterface
public interface Command extends Serializable {
   void execute();
}