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
    private static int nextCustomerID;
    
    private final int customerID;
    private String firstName, lastName, address, email, phone;
    private ArrayList<Transaction> transactionHist;
   
     
    public Customer(int newID, String fName, String lName, String newAddress, String newPhone, String newEmail){
        this.customerID = newID;
        Customer.nextCustomerID++;
        this.phone = newPhone;
        this.firstName = fName;
        this.lastName = lName;
        this.address = newAddress;
        this.email = newEmail;
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
    
    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }
    
    public void addTransaction(Transaction newTransaction) {
        this.transactionHist.add(newTransaction);
    }
    
    public ArrayList<Transaction> getTransactions() {
        return this.transactionHist;
    }
    
    public Transaction getTransactionByID(int orderIDToGet) {
        for (Transaction theTransaction : this.transactionHist) {
            if (theTransaction.getOrderID() == orderIDToGet) {
                return theTransaction;
            }
        }
        return null;
    }
    
    public void printOrderHistory() {
        System.out.println("\n------------------------------------------------------------------------------------------------\n");
        System.out.println("Customer Order History (" + this.getFullName() + "): ");
        if(this.transactionHist.size() > 0) {
            System.out.println("\nOrder ID\t\tProduct ID\t\t\t\t\tQuantity\tTotal");
            this.transactionHist.stream().forEach((theTransaction) -> {
                theTransaction.printTransactionDetails();
                //System.out.println("Order ID: " + theTransaction.getOrderID() + "; Product ID: " + theTransaction.getProductID() + "; Total: $" + HelperMethods.priceToString(theTransaction.getTotal()));
            });
        } else {
            System.out.println("This customer has not placed any orders yet.");
        }
        System.out.println("\n------------------------------------------------------------------------------------------------\n");
    }
}
