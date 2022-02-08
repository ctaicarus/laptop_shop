package com.laptopshop.cta.model.order;

import java.util.Collection;

public class Cash extends Payment {

   private float cashTendered;

    public Cash(float cashTendered) {
        this.cashTendered = cashTendered;
    }

    public Cash(float cashTendered, Cart ShoppingCart, Collection<com.laptopshop.cta.model.order.Order> Order, com.laptopshop.cta.model.order.Shipment Shipment, int ID, double totalMoney) {
        super(ShoppingCart, Order, Shipment, ID, totalMoney);
        this.cashTendered = cashTendered;
    }

    public Cash() {
    }

    public float getCashTendered() {
        return cashTendered;
    }

    public void setCashTendered(float cashTendered) {
        this.cashTendered = cashTendered;
    }
        

}
