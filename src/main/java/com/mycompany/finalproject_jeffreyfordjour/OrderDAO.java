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
public class OrderDAO {
             private final ArrayList<Order> list;

    public OrderDAO() {
       list = new ArrayList<>();
    }
    
    public void create(Order order) {
        list.add(order);
    }
    
    public ArrayList<Order> getAll() {
        return list;
    }
}
