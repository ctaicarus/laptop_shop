/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laptopshop.cta.controll.orderdao;

import com.laptopshop.cta.model.customer.Customer;
import com.laptopshop.cta.model.order.Order;

/**
 *
 * @author Admin
 */
public interface OrderDAO {
    public void insert(Order order);
    public void update(Order order);
    public void cancel(Order order);
    public Order getOrderByCustomer(Customer customer);
}
