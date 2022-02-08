/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laptopshop.cta.controll.orderdao;

import com.laptopshop.cta.model.order.Shipment;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class ShipmentDAOImp implements ShipmentDAO{

    @Override
    public void add(Shipment shipment) {
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

            String sql = "insert into shipmentr(id, name, price, address) value(?,?,?,?) ";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, shipment.getID());
            preparedStatement.setString(2, shipment.getName());
            preparedStatement.setFloat(3, shipment.getPrice());
            preparedStatement.setString(1, shipment.getAddress());

            int result = preparedStatement.executeUpdate();
            if(result == 0) return; 
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }
    }

    @Override
    public void update(Shipment shipment) {
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

            String sql = "update shipment(id, name, price, address) value(?,?,?,?) ";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, shipment.getID());
            preparedStatement.setString(2, shipment.getName());
            preparedStatement.setFloat(3, shipment.getPrice());
            preparedStatement.setString(1, shipment.getAddress());

            int result = preparedStatement.executeUpdate();
            if(result == 0) return; 
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }
    }

    @Override
    public void delete(Shipment shipment) {
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

            String sql = "delete from shipment where id = ? ";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, shipment.getID());
            preparedStatement.setString(2, shipment.getName());
            preparedStatement.setFloat(3, shipment.getPrice());
            preparedStatement.setString(1, shipment.getAddress());

            int result = preparedStatement.executeUpdate();
            if(result == 0) return; 
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            
        } catch (SQLException ex) {
            
        }
    }
    
}
