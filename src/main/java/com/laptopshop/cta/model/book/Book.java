/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laptopshop.cta.model.book;

/**
 *
 * @author Admin
 */
public class Book {
    private String ISBN;
    private String title;
    private String summary;
    private int pages;
    private String language;
    private Publisher publisher;
    private String category;
    private Author author;  

    public Book(String ISBN, String title, String summary, int pages, String language, Publisher publisher, String category, Author author) {
        this.ISBN = ISBN;
        this.title = title;
        this.summary = summary;
        this.pages = pages;
        this.language = language;
        this.publisher = publisher;
        this.category = category;
        this.author = author;
    }

    public Book() {
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    
    
}
