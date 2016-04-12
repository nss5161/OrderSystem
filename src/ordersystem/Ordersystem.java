package ordersystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Nick
 */
public class Ordersystem{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean purchaseRemaining = false;
               
        generateSampleCustomers();
        
        CustomerList.getCustomers().printCustomers();
        
        generateSampleProducts();

        Inventory.getInventory().printInventoryWithInventoryValue();

        CustomerThread transactionThread;

        int melatoninToAdd = 50000;
        CustomerThread[] transactionThreads = new CustomerThread[melatoninToAdd];
        InventoryAdjustment moreMelatonin = new InventoryAdjustment(1007, melatoninToAdd, CustomerList.getCustomers().getCustomerByID(0)); // Add 50,000 melatonin units to the inventory
        int skippedThreads = 0;
        for (int i = 0; i < melatoninToAdd; i++) {
            int customerID = HelperMethods.randomInteger(1, 100);
            int itemID = 1007;
            int quantity = 1;
            transactionThreads[i] = new CustomerThread(0, itemID, quantity, customerID);           
        }
        for (int i = 0; i < transactionThreads.length; i++) {
            synchronized(transactionThreads[i]) {
                try {
                        try {
                            transactionThreads[i].start();
                            System.out.println("New thread started.");
                        } catch (java.lang.OutOfMemoryError e) {
                            // Print error if there are too many active threads – it appears 2024 is the maximum threads configured
                            skippedThreads++;
                            System.out.println("Can't create new thread - too many threads! – Loop #" + i + " – Active Threads: " + java.lang.Thread.activeCount());
                        } 
                        transactionThreads[i].wait();
                } catch(InterruptedException e) {
                    System.out.println("Had to wait!");
                }
            }
        }
        System.out.println("Thread count: " + Thread.activeCount());

        boolean threadsAreAlive;
        int loops = 0;
        do {
            loops++;
            threadsAreAlive = false;
            for (CustomerThread currentTransactionThread : transactionThreads) {
                threadsAreAlive = currentTransactionThread.isAlive() || threadsAreAlive;
            }
        } while(threadsAreAlive);
        
        System.out.println("Threads alive loops: " + loops);
        
        CustomerList.getCustomers().getCustomerByID(0).printOrderHistory();
            
        Inventory.getInventory().printInventoryWithInventoryValue();
        
        System.out.println("Skipped threads: " + skippedThreads);
        System.out.println("There should be " + (430 + skippedThreads) + " melatonin units remaining.");
        System.out.println("There are " + InventoryCollection.getInventory().getItemByID(1007).getQuantity() + " melatonin units remaining.");
    }

    public static void generateSampleProducts() {
        InventoryItem testItem = new InventoryItem(123, "Brown Dog", "A pet with 4 legs, two ears, and a nose." 200.00, 15); // (ID, name, description, price, quantity)
        InventoryCollection.getInventory().addItem(testItem);
        
        testItem = new InventoryItem(22.07, "Shimano UN55 Bracket\t", 12); // (price, description, quantity)
        InventoryCollection.getInventory().addItem(testItem);
        
        testItem = new InventoryItem(10.40, "Nag Champa Incense Sticks", 120); // (price, description, quantity)
        InventoryCollection.getInventory().addItem(testItem);
        
        testItem = new InventoryItem(6.44, "99% Isopropyl Alcohol (Pint)", 223); // (price, description, quantity)
        InventoryCollection.getInventory().addItem(testItem);
        
        testItem = new InventoryItem(12.99, "Blue Racquetballs (3-pack)", 33); // (price, description, quantity)
        InventoryCollection.getInventory().addItem(testItem);
        
        testItem = new InventoryItem(49.95, "Photive Bluetooth Earbuds", 43); // (price, description, quantity)
        InventoryCollection.getInventory().addItem(testItem);
        
        testItem = new InventoryItem(16.77, "Melatonin (3mg)\t\t", 430); // (price, description, quantity)
        InventoryCollection.getInventory().addItem(testItem);
        
        testItem = new InventoryItem(8.36, "Ahmad English Tea #1\t", 7); // (price, description, quantity)
        InventoryCollection.getInventory().addItem(testItem);
        
        testItem = new InventoryItem(15.95, "Vertical Vortex Toy\t", 70); // (price, description, quantity)
        InventoryCollection.getInventory().addItem(testItem);
        
        testItem = new InventoryItem(13.32, "Seirus Innovation 8030\t", 14); // (price, description, quantity)
        InventoryCollection.getInventory().addItem(testItem);
        
    }
    
    public static void generateSampleCustomers() {
        Customer customer = new Customer("123 Test St.", "Apt. #14", "State College", "PA", "USA", 16801, "Bob", "Smith", 1235555555);
        CustomerList.getCustomers().addCustomer(customer);
        
        for(int i = 0; i < 100; i++) {
            customer = new Customer(i + " Test St.", "Apt. #" + (int)(i/5), "State College", "PA", "USA", 16801, "Test", "Customer " + (i+1), 1235555555);
            CustomerList.getCustomers().addCustomer(customer);
        }
    }
    
}
