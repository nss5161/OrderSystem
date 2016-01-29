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
    private final int customerID;
    private String firstName, lastName, address, email, phone;
    private ArrayList<Customer> customerList;
    private final ArrayList<Transaction> transactionHist;
   
     
    public Customer(int newID, String fName, String lName, String newAddress, String newPhone, String newEmail){
        this.customerID = newID;
        this.phone = newPhone;
        this.firstName = fName;
        this.lastName = lName;
        this.address = newAddress;
        this.email = newEmail;
        this.customerList = new ArrayList<>();
        this.transactionHist = new ArrayList<>();
    }
    
    public int getCustomerID() {
        return this.customerID;
    }
    
    public String getPhoneNumber(){
        return this.phone;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setPhoneNumber(String newPhone) {
        this.phone = newPhone;
    }
    
    public void setFirst(String fName) {
        this.firstName = fName;
    }
    
    public void setLastName(String lName) {
        this.lastName = lName;
    }
    
    public void setAddress(String newAddress){
        this.address = newAddress;
    }
    
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    
    public void addTransaction(Transaction newTransaction) {
        this.transactionHist.add(newTransaction);
    }
    
    public ArrayList<Transaction> getTransactions() {
        return this.transactionHist;
    }
}
