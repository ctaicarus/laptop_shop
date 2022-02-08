package com.laptopshop.cta.model.order;

import java.util.Collection;

/**
 *
 * @author Admin
 */
public class Payment {

    Cart ShoppingCart;
    Shipment Shipment;
    private int ID;
    private double totalMoney;
    Collection<Order> Order;

    public Payment() {
    }

    public Payment(Cart ShoppingCart, Collection<Order> Order, Shipment Shipment, int ID, double totalMoney) {
        this.ShoppingCart = ShoppingCart;
        this.Order = Order;
        this.Shipment = Shipment;
        this.ID = ID;
        this.totalMoney = totalMoney;
    }

    public Cart getShoppingCart() {
        return ShoppingCart;
    }

    public void setShoppingCart(Cart ShoppingCart) {
        this.ShoppingCart = ShoppingCart;
    }

    public Collection<Order> getOrder() {
        return Order;
    }

    public void setOrder(Collection<Order> Order) {
        this.Order = Order;
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

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    


}
