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
public class InventoryItem {
    private String itemName;
    private double itemPrice;
    private String description;
    private int sku;
    int amountOnHand;
    double unitCost;
    double unitPrice;
    private ArrayList<InventoryItem> inventory;
    
    public InventoryItem(int sku, String name,  String description1, int amountOnHand, double unitCost, double unitPrice, double itemPrice){
        this.sku = sku;
        this.itemName = name;
        this.itemPrice = itemPrice;
        this.description = description1;
        this.amountOnHand = amountOnHand;
        this. unitCost = unitCost;
        this.unitPrice = unitPrice;
        this.inventory = new ArrayList<>();
        inventory.add(this);
    }
    
    public void setSku(int ii){
        ii = sku;
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
}
