package com.laptopshop.cta.model.order;

import java.util.Collection;

public class Check extends Payment {

    private String bankID;
    private String name;

    public Check() {
    }

    public Check(String bankID, String name) {
        this.bankID = bankID;
        this.name = name;
    }

    public Check(String bankID, String name, Cart ShoppingCart, Collection<com.laptopshop.cta.model.order.Order> Order, com.laptopshop.cta.model.order.Shipment Shipment, int ID, double totalMoney) {
        super(ShoppingCart, Order, Shipment, ID, totalMoney);
        this.bankID = bankID;
        this.name = name;
    }

    public String getBankID() {
        return bankID;
    }

    public void setBankID(String bankID) {
        this.bankID = bankID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

}