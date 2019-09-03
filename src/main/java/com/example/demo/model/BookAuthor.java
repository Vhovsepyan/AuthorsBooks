package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BookAuthor {

    @Column(name = "book_id")
    private long book_id;

    @Column(name = "author_id")
    private long author_id;

    public BookAuthor() {
    }

    public BookAuthor(long book_id, long author_id) {
        this.book_id = book_id;
        this.author_id = author_id;
    }

    public long getBook_id() {
        return book_id;
    }

    public void setBook_id(long book_id) {
        this.book_id = book_id;
    }

    public long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(long author_id) {
        this.author_id = author_id;
    }
}
