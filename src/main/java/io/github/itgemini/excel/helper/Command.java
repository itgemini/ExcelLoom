/**
 * Author: Mohamed Zarrouki
 */
package io.github.itgemini.excel.helper;


@FunctionalInterface
public interface Command {

    /**
     * Executes the command.
     */
    void execute();
}