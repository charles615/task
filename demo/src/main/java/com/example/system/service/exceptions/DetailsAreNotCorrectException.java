package com.example.system.service.exceptions;

public class DetailsAreNotCorrectException extends ServiceException{
    //overwrite runtimeExceptions methods
    public DetailsAreNotCorrectException() {
        super();
    }

    public DetailsAreNotCorrectException(String message) {
        super(message);
    }

    public DetailsAreNotCorrectException(String message, Throwable cause) {
        super(message, cause);
    }

    public DetailsAreNotCorrectException(Throwable cause) {
        super(cause);
    }

    protected DetailsAreNotCorrectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
