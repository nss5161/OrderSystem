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
public class TransactionMaker {
    
    public void generateCustomer(){
        Customer customer = new Customer(1000, "John Smith");
        InventoryItem trial = new InventoryItem(12345, "ITEM NAME", "Insert Item Description", 100, 10.00, 20.00, 50.00);
    }
    
}
