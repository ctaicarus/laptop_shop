package com.laptopshop.cta.model.order;

import java.util.Date;
import com.laptopshop.cta.model.customer.Customer;

public class Order {

    Cart cart;
    Customer Customer;
    Payment Payment;
    Shipment Shipment;
    private int ID;
    private Date dateCreated;
    private String status;

    public Order() {
    }

    public Cart getShoppingCart() {
        return cart;
    }

    public void setShoppingCart(Cart ShoppingCart) {
        this.cart = ShoppingCart;
    }

    public Customer getCustomer() {
        return Customer;
    }

    public void setCustomer(Customer Customer) {
        this.Customer = Customer;
    }

    public Payment getPayment() {
        return Payment;
    }

    public void setPayment(Payment Payment) {
        this.Payment = Payment;
    }

    public Shipment getShipment() {
        return Shipment;
    }

    public void setShipment(Shipment Shipment) {
        this.Shipment = Shipment;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Order(Cart ShoppingCart, Customer Customer, Payment Payment, Shipment Shipment, int ID, Date dateCreated, String status) {
        this.cart = ShoppingCart;
        this.Customer = Customer;
        this.Payment = Payment;
        this.Shipment = Shipment;
        this.ID = ID;
        this.dateCreated = dateCreated;
        this.status = status;
    }


}
