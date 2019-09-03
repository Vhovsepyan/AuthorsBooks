package com.example.demo.exeptions;

public class BookAuthorMissedException extends Exception {

    private String errorMessage;

    public BookAuthorMissedException() {
        this.errorMessage = "No author for this book";
    }

    public BookAuthorMissedException(String message, String errorMessage) {
        super(message);
        this.errorMessage = errorMessage;
    }
}
