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
public class CustomerDAO {
    private final ArrayList<Customer> list;

    public CustomerDAO() {
       list = new ArrayList<>();
    }
    
    public void create(Customer customer) {
        list.add(customer);
    }
    
    public ArrayList<Customer> getAll() {
        return list;
    }
}
