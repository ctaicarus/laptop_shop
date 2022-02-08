/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laptopshop.cta.controll.customerdao;

import com.laptopshop.cta.model.customer.Customer;
import com.laptopshop.cta.model.order.Order;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class CustomerDAOImp implements CustomerDAO{

    @Override
    public void addCustomer(Customer customer) {
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

            String sql = "insert into customer (id,firtname,lastname,mobile,sex,username, password,point) valuse (?,?,?,?,?,?,?) ";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(6, customer.getID());
            preparedStatement.setString(5, customer.getMobile());
            preparedStatement.setString(4, customer.getSex());
            preparedStatement.setDouble(3, customer.getPoint());
            preparedStatement.setString(2, customer.getAccount().getUsername());
            preparedStatement.setString(1, customer.getAccount().getPassword());

            int result = preparedStatement.executeUpdate();
            if(result == 0) return;
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }
    }

    @Override
    public void editCustomer(Customer customer) {
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

            String sql = "update customer (id,firtname,lastname,mobile,sex,username, password,point) valuse (?,?,?,?,?,?,?) ";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(6, customer.getID());
            preparedStatement.setString(5, customer.getMobile());
            preparedStatement.setString(4, customer.getSex());
            preparedStatement.setDouble(3, customer.getPoint());
            preparedStatement.setString(2, customer.getAccount().getUsername());
            preparedStatement.setString(1, customer.getAccount().getPassword());

            int result = preparedStatement.executeUpdate();
            if(result == 0) return;
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }
    }

    @Override
    public void deleteCustomer(Customer customer) {
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

            String sql = "delete from customer wher id = ?  ";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(6, customer.getID());
            preparedStatement.setString(5, customer.getMobile());
            preparedStatement.setString(4, customer.getSex());
            preparedStatement.setDouble(3, customer.getPoint());
            preparedStatement.setString(2, customer.getAccount().getUsername());
            preparedStatement.setString(1, customer.getAccount().getPassword());

            int result = preparedStatement.executeUpdate();
            if(result == 0) return;
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }
    }

    @Override
    public boolean checkLogin(String username, String password) {
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

            String sql = "select from customer where username = ? and password = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            int result = preparedStatement.executeUpdate();
            if(result == 0) return false; else if(result == 1) return true;
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }
        return true;
    }

    @Override
    public Order viewCustomerByOrder(Order order) {
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

            String sql = "select* from order where id = ? ";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, order.getCustomer().getID());

            int result = preparedStatement.executeUpdate();
            if(result == 0) return null; 
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }
        return null;
    }

    @Override
    public Customer getCustomerById(int id) {
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

            String sql = "select* from customer where id = 'id' ";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            int result = preparedStatement.executeUpdate();
            if(result == 0) return null; 
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }
        return null;
    }

    @Override
    public Customer searchCustomerByName(String name) {
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

            String sql = "select* from customer where fullname = ? ";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            int result = preparedStatement.executeUpdate();
            if(result == 0) return null; 
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }
        return null;
    }
    
}
