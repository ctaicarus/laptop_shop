package com.laptopshop.cta.model.order;

import java.util.*;

public class Shipment {

    private Payment Payment;
    private int ID;
    private String name;
    private float price;
    private String address;
    private Collection<Order> Order;

    public Shipment() {
    }

    public Shipment(Payment Payment, Collection<Order> Order, int ID, String name, float price, String address) {
        this.Payment = Payment;
        this.Order = Order;
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.address = address;
    }

    public Payment getPayment() {
        return Payment;
    }

    public void setPayment(Payment Payment) {
        this.Payment = Payment;
    }

    public Collection<Order> getOrder() {
        return Order;
    }

    public void setOrder(Collection<Order> Order) {
        this.Order = Order;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



}
