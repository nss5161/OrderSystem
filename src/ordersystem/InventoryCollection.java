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
public class InventoryCollection {
    private final ArrayList<InventoryItem> theInventoryList;
    
    private static InventoryCollection theInventory;
    
    private InventoryCollection() {
        theInventoryList = new ArrayList<>();
    }
    
    public static InventoryCollection getInventory() {
        if(theInventory == null){
            theInventory = new InventoryCollection();
        }
        return theInventory;
    }
    
    public ArrayList<InventoryItem> getInventoryList() {
        return this.theInventoryList;
    }
    
    public synchronized boolean addItem(InventoryItem newItem) {
        int itemID = newItem.getItemID();
        ArrayList<InventoryItem> inventoryList = InventoryCollection.getInventory().getInventoryList();
        if (!inventoryList.stream().noneMatch((inventoryListItem) -> (inventoryListItem.getItemID() == itemID))) {
            return false;
        }
        InventoryCollection.getInventory().getInventoryList().add(newItem);
        return true;
    }
    
    public InventoryItem getItemByID(int itemIDToGet) {
        ArrayList<InventoryItem> inventoryList = InventoryCollection.getInventory().getInventoryList();
        for (InventoryItem inventoryListItem : inventoryList) {
            if (inventoryListItem.getItemID() == itemIDToGet) {
                return inventoryListItem;
            }
        }
        
        return null;
    }

    public void printInventory() {
        System.out.println();
        System.out.println("Current Store Inventory");
        if(this.theInventoryList.size() > 0) {
            System.out.println("\nProduct ID\tDescription\t\t\t\tUnit Price\tQuantity in Stock");
            this.theInventoryList.stream().forEach((theInventoryItem) -> {
                theInventoryItem.printInventoryItem();
            });
        } else {
            System.out.println("The inventory is empty.");
        }
        System.out.println();
    }
}
