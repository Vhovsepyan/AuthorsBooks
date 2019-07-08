package com.example.demo.exeptions;

public class BookIdMismatchExceptionv extends RuntimeException{

    public BookIdMismatchExceptionv(String message, Throwable cause) {
        super(message, cause);
    }
}