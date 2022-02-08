package com.laptopshop.cta.model.customer;

import com.laptopshop.cta.model.order.Order;

import java.util.*;

public class CustomerNew extends Customer {

    private String note;

    public CustomerNew() {
    }

    public CustomerNew(String note) {
        this.note = note;
    }

    public CustomerNew(String note, Collection<Order> Order, FullName fullname, Account Account, Address Address, int ID, String mobile, String sex, Date dateOfBirth, double point) {
        super(fullname, Account, Address, ID, mobile, sex, dateOfBirth, point);
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    

}
