/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laptopshop.cta.controll.bookdao;

import com.laptopshop.cta.model.book.BookItem;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class BookItemDAOImp implements BookItemDAO{

    @Override
    public void insertItem(BookItem bookItem) {
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

            String sql = "insert into bookitem (barcode,price,discount) valuse (?,?,?) ";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(3, bookItem.getBarcode());
            preparedStatement.setFloat(2, bookItem.getPrice());
            preparedStatement.setFloat(1, bookItem.getDiscount());
           

            int result = preparedStatement.executeUpdate();
            if(result == 0) return;
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }  
    }

    @Override
    public void editItem(BookItem bookItem) {
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

            String sql = "update bookitem (barcode,price,discount) valuse (?,?,?) ";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(3, bookItem.getBarcode());
            preparedStatement.setFloat(2, bookItem.getPrice());
            preparedStatement.setFloat(1, bookItem.getDiscount());
           

            int result = preparedStatement.executeUpdate();
            if(result == 0) return;
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }      
    }

    @Override
    public void deleteItem(BookItem bookItem) {
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

            String sql = "delete  from bookitem where barcode = ? ";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(3, bookItem.getBarcode());
            preparedStatement.setFloat(2, bookItem.getPrice());
            preparedStatement.setFloat(1, bookItem.getDiscount());
           

            int result = preparedStatement.executeUpdate();
            if(result == 0) return;
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {

        }
            
    }

    @Override
    public BookItem searchByName(String name) {
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

            String sql = "select from bookitem where name = ? ";
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
