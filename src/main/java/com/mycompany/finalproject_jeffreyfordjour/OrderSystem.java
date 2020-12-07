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
public class OrderSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      CustomerDAO cusDAO = new CustomerDAO();
      OrderDAO ordDAO = new OrderDAO();
      OrderItemDAO oIDAO = new OrderItemDAO();
      ProductDAO prodDAO = new ProductDAO();
    
      Customer cus1 = new Customer(3,"Jeffrey","Fordjour","123-456-7890");
      Customer cus2 = new Customer(6,"Daniel","Fordjour","123-456-7584");
      Customer cus3 = new Customer(55,"Nancy","Fordjour","123-456-8949");
      cusDAO.create(cus1);
      cusDAO.create(cus2);
      cusDAO.create(cus3);
      ArrayList<Customer> cusList = cusDAO.getAll();
      
  
      Product prod1 = new Product(10,"Phone",70,200.25);
      Product prod2 = new Product(11,"Headphones",322,50.25);
      Product prod3 = new Product(12,"Hat",99,9.95);
      prodDAO.create(prod1);
      prodDAO.create(prod2);
      prodDAO.create(prod3);
      ArrayList<Product> prodList = prodDAO.getAll();

      
      Order ord1 = new Order(7,cus1.getCustomerID(),"12-6-2020");
      Order ord2 = new Order(8,cus2.getCustomerID(),"12-3-2020");
      Order ord3 = new Order(14,cus3.getCustomerID(),"12-2-2020");
      ordDAO.create(ord1);
      ordDAO.create(ord2);
      ordDAO.create(ord3);
      ArrayList<Order> ordList = ordDAO.getAll();

      OrderItem oI1 = new OrderItem(ord1.getOrderNumber(),30,prod1.getProductID(),prod1.getDescription(),1,prod1.getPrice());
      OrderItem oI2 = new OrderItem(ord2.getOrderNumber(),25,prod2.getProductID(),prod2.getDescription(),1,prod2.getPrice());
      OrderItem oI3 = new OrderItem(ord3.getOrderNumber(),24,prod3.getProductID(),prod3.getDescription(),1,prod3.getPrice());
      OrderItem oI4 = new OrderItem(ord1.getOrderNumber(),23,prod2.getProductID(),prod2.getDescription(),1,prod2.getPrice());
      OrderItem oI5 = new OrderItem(ord2.getOrderNumber(),22,prod1.getProductID(),prod1.getDescription(),1,prod1.getPrice());
      OrderItem oI6 = new OrderItem(ord3.getOrderNumber(),19,prod2.getProductID(),prod2.getDescription(),1,prod2.getPrice());
      oIDAO.create(oI1);
      oIDAO.create(oI2);
      oIDAO.create(oI3);
      oIDAO.create(oI4);
      oIDAO.create(oI5);
      oIDAO.create(oI6);
      ArrayList<OrderItem> oIList = oIDAO.getAll();
      
      for(Customer cus: cusList) {
         System.out.println(cus.toString());
         for(Order ord: ordList) {
             if(ord.getCustomerID() == cus.getCustomerID()) {
                 System.out.println(ord.toString());
                 for(OrderItem oI: oIList) {
                    if(oI.getOrderNumber() == ord.getOrderNumber()) {
                        System.out.println(oI.toString());
                    }
             }
             }
         }
         System.out.println("---------------------------------------------------");
      }
    }
    
    
}
