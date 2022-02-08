/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laptopshop.cta.model.customer;


/**
 *
 * @author Admin
 */
import java.util.*;
import com.laptopshop.cta.model.order.Order;

public class Customer {
    FullName fullname;
    Account Account;
    Address Address;
    private int ID;
    private String mobile;
    private String sex;
    private Date dateOfBirth;
    private double point;
    Collection<Order> Order;

    public Customer() {
    }

    public Customer( FullName fullname, Account Account, Address Address, int ID, String mobile, String sex, Date dateOfBirth, double point) {
        this.fullname = fullname;
        this.Account = Account;
        this.Address = Address;
        this.ID = ID;
        this.mobile = mobile;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.point = point;
    }

    public Collection<Order> getOrder() {
        return Order;
    }

    public void setOrder(Collection<Order> Order) {
        this.Order = Order;
    }

    public FullName getFullname() {
        return fullname;
    }

    public void setFullname(FullName fullname) {
        this.fullname = fullname;
    }

    public Account getAccount() {
        return Account;
    }

    public void setAccount(Account Account) {
        this.Account = Account;
    }

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address Address) {
        this.Address = Address;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }


}