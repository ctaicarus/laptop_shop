package com.laptopshop.cta.model.customer;

import java.util.Collection;
import java.util.Date;
import com.laptopshop.cta.model.order.Order;

/**
 *
 * @author Admin
 */
public class CustomerMember extends Customer {

   private String cardNumber;

    public CustomerMember(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CustomerMember() {
    }

    public CustomerMember(Collection<Order> Order, FullName fullname, Account Account,Address Address, int ID, String mobile, String sex, Date dateOfBirth, double point) {
        super(fullname, Account, Address, ID, mobile, sex, dateOfBirth, point);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
      

}
