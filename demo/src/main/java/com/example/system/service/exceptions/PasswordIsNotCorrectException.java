package com.example.system.service.exceptions;

public class PasswordIsNotCorrectException extends ServiceException{
    //overwrite runtimeExceptions methods
    public PasswordIsNotCorrectException() {
        super();
    }

    public PasswordIsNotCorrectException(String message) {
        super(message);
    }

    public PasswordIsNotCorrectException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordIsNotCorrectException(Throwable cause) {
        super(cause);
    }

    protected PasswordIsNotCorrectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
