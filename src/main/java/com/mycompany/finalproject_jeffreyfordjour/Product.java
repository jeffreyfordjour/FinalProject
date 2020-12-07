/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproject_jeffreyfordjour;

/**
 *
 * @author frys
 */
public class Product {
    private int productID;
    private String description;
    private int quantityOnHand;       
    private double price;
    
    public int getProductID() {
    return productID;
    }
    
    public String getDescription() {
    return description;
    }
    
    public int getQuantityOnHand() {
    return quantityOnHand;
    }
    
    public double getPrice() {
    return price;
    }
    
     public void setProductID(int newProductID) {
   this.productID = newProductID;
   }
     
      public void setDescription(String newDescription) {
   this.description = newDescription;
   }
      
     public void setQuantityOnHand(int newQuantityOnHand) {
   this.quantityOnHand = newQuantityOnHand;
   } 
      public void setPrice(double newPrice) {
   this.price = newPrice;
   }   
      public Product(int id, String desc, int qtyOnHand, double pric) {
   productID = id;
   description = desc;
   quantityOnHand = qtyOnHand;
   price = pric;
      }
      @Override
      public String toString() { 
        return String.format("Product: "+ productID + " Description = "+ description + " QuantityOnHand = "+ quantityOnHand + " Price = "+ price); 
    } 
}


