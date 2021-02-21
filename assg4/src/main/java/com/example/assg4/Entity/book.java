package com.example.assg4.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="book")
public class book {

    //@Id
    private Integer ID; //@ID identifies that ID field is unique
    private String Title;
    private String Author;


    public book(Integer ID, String Title, String Author) {
        this.ID=ID;
        this.Title = Title;
        this.Author = Author;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
