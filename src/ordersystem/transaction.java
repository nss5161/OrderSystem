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
public abstract class transaction{
    
    int transactionID;
    
    public transaction(int id){
        transactionID = id;
    }
    public int getTransactionID(){
        return transactionID;
    }
}
