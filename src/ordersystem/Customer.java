/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordersystem;

import java.util.ArrayList;

/**
 *
 * @author Nick
 */
public class Customer {
    private int customerID;
    private String customerName;
    private ArrayList<Customer> customerList;
   
    public Customer(int number, String name){
        this.customerID = number;
        this.customerName = name;
        this.customerList = new ArrayList<>();
        customerList.add(this);
    }
    
    public String getCustomerName(){
        return customerName;
    }
    
    public void setOrderName(String custName){
        custName = customerName;
    }
    
    public void setID(int custID){
        custID = customerID;
    }
    
    
}
