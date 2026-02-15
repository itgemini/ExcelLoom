/**
 * Author: Mohamed Zarrouki
 */
package io.github.itgemini.excel.helper.writer.style.condional;

import java.io.Serializable;

@FunctionalInterface
public interface Command extends Serializable {
   void execute();
}