package com.epam.geometry.logic;

public class DataException extends Exception {

    public DataException() {
        super();
    }

    public <e> DataException(String message, e) {
        super(message);
    }

    public DataException(String message, Throwable cause) {
        super(message, cause);
    }
}
