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
public class BookItem {
    private Book book;
    private String barcode;
    private float price;
    private float discount;   

    public BookItem(Book book, String barcode, float price, float discount) {
        this.book = book;
        this.barcode = barcode;
        this.price = price;
        this.discount = discount;
    }

    public BookItem() {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
    
}
