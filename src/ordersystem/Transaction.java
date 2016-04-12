/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordersystem;

/**
 *
 * @author Nick
 */
public abstract class Transaction{
    
    private static int nextOrderID;
    
    public abstract boolean processTransaction(int theProductID, int theQuantity, Customer theCustomer);
    
    public static int getNextOrderID() {
        if (nextOrderID > 0) {
            nextOrderID++;
        } else {
            nextOrderID = 1;
        }
        return nextOrderID;
    }
    
    public abstract int getOrderID();

    public abstract double getTotal();

    public abstract int getProductID();
 
    public abstract int getQuantity();

    public abstract int getType();

    public abstract void printTransactionDetails();
}
