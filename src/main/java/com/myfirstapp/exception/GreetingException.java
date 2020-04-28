package com.myfirstapp.exception;

public class GreetingException extends RuntimeException {

    public GreetingException(String message) {
        super(message);
    }
}
