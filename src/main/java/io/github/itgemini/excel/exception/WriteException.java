/**
 * Author: Mohamed Zarrouki
 */
package io.github.itgemini.excel.exception;


public class WriteException extends RuntimeException {
    public WriteException(String message, Throwable cause){
        super(message, cause);
    }

    public WriteException(String message){
        super(message);
    }
}
