package com.dailycodebuffer.Springboot.tutorial.error;

public class AmbulanceNotFoundException extends Exception{
    public AmbulanceNotFoundException() {
        super();
    }

    public AmbulanceNotFoundException(String message) {
        super(message);
    }

    public AmbulanceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public AmbulanceNotFoundException(Throwable cause) {
        super(cause);
    }

    protected AmbulanceNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
