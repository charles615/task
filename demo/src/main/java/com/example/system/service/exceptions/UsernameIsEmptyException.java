package com.example.system.service.exceptions;

public class UsernameIsEmptyException extends ServiceException{
    //overwrite runtimeExceptions methods
    public UsernameIsEmptyException() {
        super();
    }

    public UsernameIsEmptyException(String message) {
        super(message);
    }

    public UsernameIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsernameIsEmptyException(Throwable cause) {
        super(cause);
    }

    protected UsernameIsEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
