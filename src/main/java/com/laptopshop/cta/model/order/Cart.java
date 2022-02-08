package com.laptopshop.cta.model.order;

import java.util.*;
import com.laptopshop.cta.model.book.BookItem;

public class Cart {
    private Payment Payment;
    private Collection<BookItem> BookItem;
    private int ID;
    private Date dateCreated;
    private double totalAmount;
    private Collection<Order> Order;

    public Cart() {
    }

    public Cart(Collection<Order> Order, Payment Payment, Collection<BookItem> BookItem, int ID, Date dateCreated, double totalAmount) {
        this.Order = Order;
        this.Payment = Payment;
        this.BookItem = BookItem;
        this.ID = ID;
        this.dateCreated = dateCreated;
        this.totalAmount = totalAmount;
    }

    public Collection<Order> getOrder() {
        return Order;
    }

    public void setOrder(Collection<Order> Order) {
        this.Order = Order;
    }

    public Payment getPayment() {
        return Payment;
    }

    public void setPayment(Payment Payment) {
        this.Payment = Payment;
    }

    public Collection<BookItem> getBookItem() {
        return BookItem;
    }

    public void setBookItem(Collection<BookItem> BookItem) {
        this.BookItem = BookItem;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }



}