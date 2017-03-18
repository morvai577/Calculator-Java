package com.vaibhav.calculator;

/**
 * Created by imac on 18/03/17.
 */
public class InvalidStatementException extends Exception{
    public InvalidStatementException(String reason, String statement){
        super(reason + ": " + statement);
    }

    public InvalidStatementException(String reason, String statement, Throwable cause){
        super(reason + ": " + statement, cause);
    }
}
