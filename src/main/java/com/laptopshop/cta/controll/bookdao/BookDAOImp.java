/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laptopshop.cta.controll.bookdao;

import java.sql.*;
import com.laptopshop.cta.model.book.Book;



/**
 *
 * @author Admin
 */
public class BookDAOImp implements BookDAO{

    @Override
    public void insert(Book book) {
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

            String sql = "insert into book (title,summary,page,language,category) valuse (?,?,?,?,?) ";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(6, book.getISBN());
            preparedStatement.setString(5, book.getTitle());
            preparedStatement.setString(4, book.getSummary());
            preparedStatement.setString(3, book.getLanguage());
            preparedStatement.setString(2, book.getCategory());
            preparedStatement.setInt(1, book.getPages());

            int result = preparedStatement.executeUpdate();
            if(result == 0) return;
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }
    }

    @Override
    public void edit(Book book) {
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

            String sql = "update book title = ?, summary = ?, page = ?, language = ?, category = ? where id = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(6, book.getISBN());
            preparedStatement.setString(5, book.getTitle());
            preparedStatement.setString(4, book.getSummary());
            preparedStatement.setString(3, book.getLanguage());
            preparedStatement.setString(2, book.getCategory());
            preparedStatement.setInt(1, book.getPages());

            int result = preparedStatement.executeUpdate();
            if(result == 0) return;
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }
    }

    @Override
    public void delete(Book book) {
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

            String sql = "delete from book where id = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(6, book.getISBN());
            preparedStatement.setString(5, book.getTitle());
            preparedStatement.setString(4, book.getSummary());
            preparedStatement.setString(3, book.getLanguage());
            preparedStatement.setString(2, book.getCategory());
            preparedStatement.setInt(1, book.getPages());

            int result = preparedStatement.executeUpdate();
            if(result == 0) return;
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }
    }
    
}
