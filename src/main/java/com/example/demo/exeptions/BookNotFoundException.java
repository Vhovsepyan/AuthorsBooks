package com.example.demo.exeptions;

public class BookNotFoundException extends RuntimeException{
 
    public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}