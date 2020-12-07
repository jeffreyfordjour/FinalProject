/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproject_jeffreyfordjour;

import java.util.ArrayList;

/**
 *
 * @author frys
 */
public class OrderItemDAO {
     private final ArrayList<OrderItem> list;

    public OrderItemDAO() {
       list = new ArrayList<>();
    }
    
    public void create(OrderItem orderItem) {
        list.add(orderItem);
    }
    
    public ArrayList<OrderItem> getAll() {
        return list;
    }
}
