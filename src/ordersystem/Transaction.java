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
    
    private final int transactionID;
    
    public Transaction(int newID){
        this.transactionID = newID;
    }
    
    public void setTransactionID(int newID){
    }
    
    public abstract int getOrderID();
    
    public abstract int getTotal();
    
    public abstract int getProductID();
    
    public abstract int getQuantity();
    
    public abstract int getType();
    
    public abstract int printTransactionDetails();
}
