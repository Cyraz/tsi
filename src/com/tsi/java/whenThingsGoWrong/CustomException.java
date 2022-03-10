package com.tsi.java.whenThingsGoWrong;

public class CustomException extends Exception{
    String message;

    public CustomException(String message) {
        super(message);
        this.message = message;
    }
}
