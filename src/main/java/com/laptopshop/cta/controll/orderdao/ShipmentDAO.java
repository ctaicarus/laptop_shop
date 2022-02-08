/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laptopshop.cta.controll.orderdao;

import com.laptopshop.cta.model.order.Shipment;

/**
 *
 * @author Admin
 */
public interface ShipmentDAO {
    public void add(Shipment shipment);
    public void update(Shipment shipment);
    public void delete(Shipment shipment);
}
