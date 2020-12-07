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
public class Order {
    private int orderNumber;
    private int customerID;
    private String date;
    
    public int getOrderNumber() {
    return orderNumber;
    }
    
    public int getCustomerID() {
    return customerID;
    }
    
    public String getDate() {
    return date;
    }
    
    public void setOrderNumber(int newOrderNumber) {
   this.orderNumber = newOrderNumber;
    }
   
    public void setCustomerID(int newCustomerID) {
   this.customerID = newCustomerID;
   }
    
    public void setDate (String newPhoneNumber) {
   this.date = newPhoneNumber;
   }
    
    public Order(int number, int custid, String dat) {
   orderNumber = number;
   customerID = custid;
   date = dat;
    }
   
   @Override
   public String toString() { 
        return String.format("Order: "+ orderNumber + " CustomerID = "+ customerID + " Date = "+ date); 
    } 
}
