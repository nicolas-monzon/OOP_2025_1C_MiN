package org.example.error;

public class EmptyStringException extends RuntimeException {

    public EmptyStringException(String message) {
        super(message);
    }

}
