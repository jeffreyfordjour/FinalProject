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
public class OrderItem {
    private int orderNumber;
    private int lineNumber;
    private int productID;
    private String productDescription;
    private int quantity;
    private double price;
    
    public int getOrderNumber() {
    return orderNumber;
    }
    
    public int getLineNumber() {
    return lineNumber;
    }
    
    public int getProductID() {
    return productID;
    }
    
    public String getProductDescription() {
    return productDescription;
    }
    
    public int getQuantity() {
    return quantity ;
    }
    
     public double getPrice() {
    return price ;
    }
    
    public void setOrderNumber(int newOrderNumber) {
   this.orderNumber = newOrderNumber;
   }
    
   public void setLineNumber(int newLineNumber) {
   this.lineNumber = newLineNumber;
   } 

   public void setProductID(int newProductID) {
   this.productID = newProductID;
   }   
   
   public void setProductDescription(String newProductDescription) {
   this.productDescription = newProductDescription;
   }
   
   public void setQuantity(int newQuantity) {
   this.quantity = newQuantity;
   }
   
    public void setPrice(double newPrice) {
   this.price = newPrice;
    }
   
    public OrderItem(int orderNum, int lineNum, int prodID, String desc, int qty, double pric) {
   orderNumber = orderNum;
   lineNumber = lineNum;
   productID = prodID;
   productDescription = desc;
   quantity = qty;
   price = pric;
   }
    
    @Override
   public String toString() { 
        return String.format("OrderItem: "+ " OrderNumber:" + orderNumber + " LineNumber = "+ lineNumber + " ProductID = "+ productID + " ProductDescription = "+ productDescription + " Quantity = "+ quantity + " Price"+ price ); 
    } 
}
