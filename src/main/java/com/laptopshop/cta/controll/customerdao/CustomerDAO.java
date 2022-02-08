/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laptopshop.cta.controll.customerdao;

import com.laptopshop.cta.model.customer.Customer;
import com.laptopshop.cta.model.order.Order;

/**
 *
 * @author Admin
 */
public interface CustomerDAO {
    public void addCustomer(Customer customer);
    public void editCustomer(Customer customer);
    public void deleteCustomer(Customer customer);
    public boolean checkLogin(String username, String password);
    public Order viewCustomerByOrder(Order order);
    public Customer getCustomerById(int id);
    public Customer searchCustomerByName(String name);
    
}
