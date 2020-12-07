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
public class Customer {
   private int customerID;
   private String firstName;
   private String lastName;
   private String phoneNumber;
   
   public int getCustomerID(){
   return customerID;
   }
   
   public String getFirstName(){
   return firstName;
   }
   public String getLastName(){
   return lastName;
   }
   
   public String getPhoneNumber(){
   return phoneNumber;
   }
   
   public void setCustomerID(int newCustomerID) {
   this.customerID = newCustomerID;
   }
   
   public void setFirstName(String newFirstName) {
   this.firstName = newFirstName;
   }
   
   public void setLastName(String newLastName) {
   this.lastName = newLastName;
   }
   
   public void setPhoneNumber(String newPhoneNumber) {
   this.phoneNumber = newPhoneNumber;
   }
   
   public Customer(int id, String fName, String lName, String phone) {
   customerID = id;
   firstName = fName;
   lastName = lName;
   phoneNumber = phone;
   }
   @Override
   public String toString() { 
        return String.format("Customer:" + " FirstName = "+ firstName + " LastName = "+ lastName + " PhoneNumber = "+ phoneNumber); 
    } 
} 
   

