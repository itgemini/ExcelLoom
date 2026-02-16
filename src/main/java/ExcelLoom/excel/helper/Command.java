/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.helper;


@FunctionalInterface
public interface Command {

    /**
     * Executes the command.
     */
    void execute();
}