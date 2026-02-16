/**
 * Author: Mohamed Zarrouki
 */
package ExcelLoom.excel.enums;


/**
 * The Status enumeration represents a set of predefined statuses
 * that can be used to indicate various outcomes or states in an application.
 *
 * Each constant provides a semantic meaning for the represented status:
 * - WARNING: Indicates a potential issue or concern.
 * - ERROR: Represents a critical problem or failure.
 * - SUCCESS: Indicates a positive or successful state.
 * - DEFAULT: Represents a neutral or unspecified state.
 */
public enum Status {
        /**
         * Warning status indicating a potential issue or concern.
         */
        WARNING,

        /**
         * Error status indicating a critical problem.
         */
        ERROR,

        /**
         * Success status indicating a positive outcome.
         */
        SUCCESS,

        /**
         * Success status indicating a neutral outcome.
         */
        DEFAULT
    }