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
    private int nextInventoryID;
    
    private String itemName, description;
    private double itemPrice;
    private int itemID, quantity;
    
    public InventoryItem(int newID, String name, String newDescription, double price, int newQuantity){
        this.itemID = newID;
        nextInventoryID++;
        this.itemName = name;
        this.description = newDescription;
        this.itemPrice = price;
        this.quantity = 0;
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
    
    public void getInventoryItem(){
        System.out.print(this.itemID + "---" + this.itemName + "----" + this.description + "---" + this.itemPrice + "---" + this.quantity);
    }
    
    public void printInventoryItem() {
        System.out.println(this.itemID + "\t\t" + this.description + "\t\t$" + this.itemPrice + "\t\t" + this.quantity);
    }
}
