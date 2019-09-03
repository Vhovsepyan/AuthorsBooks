package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "author_table")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "author_id")
    private long id;

    @Column(name = "author_name")
    private String name;

    @Column(name = "author_surname")
    private String surname;

    @Column(name = "unique_id", unique = true)
    private String uniqueId;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public String getUniqueId() {
        return uniqueId;
    }
    public void setUniqueId() {
        this.uniqueId = name + surname;
    }


}
