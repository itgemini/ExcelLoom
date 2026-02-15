/**
 * Author: Mohamed Zarrouki
 */
package io.github.itgemini.excel.exception;


public class ReadException extends RuntimeException {
    public ReadException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReadException(String message) {
        super(message);
    }
}
