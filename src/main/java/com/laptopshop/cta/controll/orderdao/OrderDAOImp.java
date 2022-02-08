/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laptopshop.cta.controll.orderdao;

import com.laptopshop.cta.model.customer.Customer;
import com.laptopshop.cta.model.order.Order;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class OrderDAOImp implements OrderDAO{

    @Override
    public void insert(Order order) {
        try {

            String DB_URL = "jdbc:mysql://localhost:3306/online_shop";

            String USER = "root";
            String PASS = "";

            Connection conn = null;
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            //Execute a query
            System.out.println("Creating statement...");

            String sql = "insert into order(id, status, date) value(?,?,?) ";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, order.getCustomer().getID());

            int result = preparedStatement.executeUpdate();
            if(result == 0) return; 
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }
 
    }

    @Override
    public void update(Order order) {
        try {

            String DB_URL = "jdbc:mysql://localhost:3306/online_shop";

            String USER = "root";
            String PASS = "";

            Connection conn = null;
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            //Execute a query
            System.out.println("Creating statement...");

            String sql = "update order(id, status, date) value(?,?,?) ";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, order.getCustomer().getID());

            int result = preparedStatement.executeUpdate();
            if(result == 0) return; 
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }
    }

    @Override
    public void cancel(Order order) {
        try {

            String DB_URL = "jdbc:mysql://localhost:3306/online_shop";

            String USER = "root";
            String PASS = "";

            Connection conn = null;
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            //Execute a query
            System.out.println("Creating statement...");

            String sql = "delete from order where id = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, order.getCustomer().getID());

            int result = preparedStatement.executeUpdate();
            if(result == 0) return; 
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }
    }

    @Override
    public Order getOrderByCustomer(Customer customer) {
        try {

            String DB_URL = "jdbc:mysql://localhost:3306/online_shop";

            String USER = "root";
            String PASS = "";

            Connection conn = null;
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            //Execute a query
            System.out.println("Creating statement...");

            String sql = "update order(id, status, date) value(?,?,?) ";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, customer.getOrder().size());

            int result = preparedStatement.executeUpdate();
            if(result == 0) return null; 
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }
        return null ;
    }
    
}
