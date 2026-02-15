/**
 * Author: Mohamed Zarrouki
 */
package org.gemini.it.excel.exception;


public class WriteException extends RuntimeException {
    public WriteException(String message, Throwable cause){
        super(message, cause);
    }

    public WriteException(String message){
        super(message);
    }
}
