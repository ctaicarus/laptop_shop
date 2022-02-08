package com.laptopshop.cta.model.order;

import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Credit extends Payment {

    private String number;
    private String type;
    private Date date;

    public Credit() {
    }

    public Credit(String number, Date date) {
        this.number = number;
        this.date = date;
    }

    public Credit(String number, String type, Date date) {
        this.number = number;
        this.type = type;
        this.date = date;
    }

    public Credit(String number, String type, Date date, Cart ShoppingCart, Collection<com.laptopshop.cta.model.order.Order> Order, com.laptopshop.cta.model.order.Shipment Shipment, int ID, double totalMoney) {
        super(ShoppingCart, Order, Shipment, ID, totalMoney);
        this.number = number;
        this.type = type;
        this.date = date;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    

}
