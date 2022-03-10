package com.tsi.java.whenThingsGoWrong;

public class CustomUnCheckedException extends RuntimeException{
    String message;

    public CustomUnCheckedException(String message) {
        super(message);
        this.message = message;
    }
}
