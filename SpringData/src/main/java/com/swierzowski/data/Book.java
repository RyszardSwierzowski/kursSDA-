package com.swierzowski.data;


import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String numberOfPeges;


    @OneToOne(cascade = CascadeType.ALL)
    private Author author;


    public Book(String title, String numberOfPeges, Author author) {
        this.title = title;
        this.numberOfPeges = numberOfPeges;
        this.author = author;
    }

    public Book() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNumberOfPeges() {
        return numberOfPeges;
    }

    public void setNumberOfPeges(String numberOfPeges) {
        this.numberOfPeges = numberOfPeges;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}




