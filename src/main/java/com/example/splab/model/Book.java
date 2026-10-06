package com.example.splab.model;

import lombok.Data;

@Data 
public class Book {
    private String title;
    private Author author;
    private Element contents;

    public Book(String title, Author author, Element contents){
        this.title = title;
        this.author = author;
        this.contents = contents;
    }

    public void printBookDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author " + author.toString());
        contents.printElementDetails();
    }
}
