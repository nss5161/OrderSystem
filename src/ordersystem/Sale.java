/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordersystem;

/**
 *
 * @author nss5161
 */
public class Sale {
    private int orderID;
    private double total;
    private int productID;
    private int quantity;
    private int type;
    
    public Sale(int newProductID, int newQuantity, Customer newCustomer) {
        this.processTransaction(newProductID, newQuantity, newCustomer);
    }
    
    public synchronized final boolean processTransaction(int theProductID, int theQuantity, Customer theCustomer) {
        if(InventoryCollection.getInventory().getItemByID(theProductID).getQuantity() >= theQuantity) {
            // Valid transaction; deduct quantity and process order
            InventoryCollection.getInventory().getItemByID(theProductID).setQuantity(InventoryCollection.getInventory().getItemByID(theProductID).getQuantity() - theQuantity);
            int newOrderID = Transaction.getNextOrderID();
            this.orderID = newOrderID;
            this.total = (InventoryCollection.getInventory().getItemByID(theProductID).getItemPrice()) * (theQuantity);
            this.productID = theProductID;
            this.quantity = theQuantity;
            this.type = 0; // 0 = sale
            
            //CustomerCollection.getCustomers().getCustomerByID(theCustomer.getCustomerID()).addTransaction(this);
            System.out.println("Valid transaction. Successful sale of " + theQuantity + " " + InventoryCollection.getInventory().getItemByID(theProductID).getDescription() + "(s) to " + theCustomer.getFullName() + " for a total of $" + this.total + "." + " (Order ID: " + this.orderID + ")");
            return true;
        }else{
            // Offer to allow sale of entire current stock instead
            System.out.println("The quantity of " + InventoryCollection.getInventory().getItemByID(theProductID).getDescription() + " you requested is not available. Would you like to purchase the remaining stock (" + InventoryCollection.getInventory().getItemByID(theProductID).getQuantity() + ")? [y/n]");
            return false;   
        }
    }

    public int getOrderID() {
        return this.orderID;
    }
    
    public double getTotal() {
        return this.total;
    }
    
    public int getProductID() {
        return this.productID;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public int getType() {
        return this.type;
    }

    public void printTransactionDetails() {
        System.out.println(this.orderID + " (sale)\t\t" + this.productID + " (" + InventoryCollection.getInventory().getItemByID(this.productID).getDescription() + ")\t\t" + this.quantity + "\t\t$" + this.total);
    }
}