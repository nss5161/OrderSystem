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
    private String itemName, description;
    private double itemPrice;
    private int itemID, quantity;
    private ArrayList<InventoryItem> inventory;
    
    public InventoryItem(int newID, String name, String newDescription, double price, int newQuantity){
        this.itemName = name;
        this.itemPrice = price;
        this.itemID = newID;
        this.description = newDescription;
        this.quantity = newQuantity;
        this.inventory = new ArrayList<>();
    }
    
    public String getItemName(){
        return this.itemName;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public double getItemPrice(){
        return this.itemPrice;
    }
    
    public int getItemID(){
        return this.itemID;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    public void setItemName(String name){
        this.itemName = name;
    }
    
    public void setItemPrice(double price){
        this.itemPrice = price;
    }
    
    public void setDescription(String newDescription){
        this.description = newDescription;
    }
    
    public void setItemID(int newID){
        this.itemID = newID;
    }
    
    public void setQuantity(int newQuantity){
        this.quantity = newQuantity;
    }

    public void addItem(InventoryItem newInventoryItem) {
        this.inventory.add(newInventoryItem);
    }
    
    public ArrayList<InventoryItem> getInventoryItem() {
        return this.inventory;
    }
    
    public void getInventoryDetails(){
        System.out.print(this.itemID + "---" + this.itemName + "----" + this.description + "---" + this.itemPrice + "---" + this.quantity);
    }
}
