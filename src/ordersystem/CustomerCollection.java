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
public class CustomerCollection {
    private final ArrayList<Customer> customers;
    
    private static CustomerCollection collection;
    
    private CustomerCollection(){
        customers = new ArrayList<>();
    }
    
    public static CustomerCollection getCustomers() {
        if(collection == null){
            collection = new CustomerCollection();
        }
        return collection;
    }
    
    public ArrayList<Customer> getCustomerCollection() {
        return this.customers;
    }
    
    public boolean addCustomer(Customer newCustomer) {
        int customerID = newCustomer.getCustomerID();
        ArrayList<Customer> customersList = CustomerCollection.getCustomers().getCustomerCollection();
        if (!customersList.stream().noneMatch((customersListItem) -> (customersListItem.getCustomerID() == customerID))) {
            return false;
        }
        CustomerCollection.getCustomers().getCustomerCollection().add(newCustomer);
        return true;
    }
    
    public Customer getCustomerByID(int itemIDToGet) {
        ArrayList<Customer> customersList = CustomerCollection.getCustomers().getCustomerCollection();
        for (Customer customersListItem : customersList) {
            if (customersListItem.getCustomerID() == itemIDToGet) {
                return customersListItem;
            }
        }
        
        return null;
    }
    
    public void printCustomers() {
        this.getCustomerCollection().stream().forEach((customersListItem) -> {
            System.out.println("Customer ID: " + customersListItem.getCustomerID() + "; Name: " + customersListItem.getFullName());
        });
    }
}
