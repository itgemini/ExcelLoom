/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.exception;


public class ReadException extends RuntimeException {
    public ReadException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReadException(String message) {
        super(message);
    }
}
