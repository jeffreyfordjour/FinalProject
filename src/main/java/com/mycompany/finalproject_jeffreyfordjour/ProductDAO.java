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
public class ProductDAO {
     private final ArrayList<Product> list;

    public ProductDAO() {
       list = new ArrayList<>();
    }
    
    public void create(Product product) {
        list.add(product);
    }
    
    public ArrayList<Product> getAll() {
        return list;
    }
}
