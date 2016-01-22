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
public class InventoryItem {
    private int itemID;
    private String itemName;
    private double itemPrice;
    private String description;
    
    
    public void setItemID(int ii){
        ii = itemID;
    }
    
    public void setItemName(String name){
        name = itemName;
    }
    
    public void setItemPrice(double price){
        price = itemPrice;
    }
    
    public void setDescription(String d){
        d = description;
    }
    int sku;
    String Description;
    int amountOnHand;
    double unitCost;
    double unitPrice;
    
    public InventoryItem(int sku, String description1, int amountOnHand, double unitCost, double unitPrice){
        this.sku = sku;
        this.description = description1;
        this.amountOnHand = amountOnHand;
        this. unitCost = unitCost;
        this.unitPrice = unitPrice;
    }
}
