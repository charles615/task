package com.example.system.service.exceptions;

public class UsernameIsUsedException extends ServiceException{
    //overwrite runtimeExceptions methods
    public UsernameIsUsedException() {
        super();
    }

    public UsernameIsUsedException(String message) {
        super(message);
    }

    public UsernameIsUsedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsernameIsUsedException(Throwable cause) {
        super(cause);
    }

    protected UsernameIsUsedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
