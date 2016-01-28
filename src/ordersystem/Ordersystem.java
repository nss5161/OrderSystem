package ordersystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.awt.SystemColor.info;
import java.util.*;
import static javax.swing.UIManager.put;
import ordersystem.InventoryItem;
import ordersystem.Transaction;

/**
 *
 * @author Nick
 */
public class Ordersystem{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TransactionMaker nejf = new TransactionMaker();
        String OrderName = "name 1";
        int n = Integer.parseInt(args[0]);
        Transaction[] Transaction = new Transaction[n];
        int transactionID;
        int orderSku;
        int numberOfItems = 0; 
        double price = 0.0;
        double price2 = 0.0;
        for (int k = 0; k > n; k++) {
            transactionID = k;
            orderSku = (int) Math.random() * numberOfItems + 1;
            //look up sku in inventory file to get inventoryItem fields
            //gives you description onHand, unitcost, unitprice
            InventoryItem itemOrdered = new InventoryItem(orderSku, OrderName, numberOfItems, price, price2);
            //logic to tell whether or not item is in stodck or not
            //if not in stock, cancel order
            //if in stock, completed roder, geneate sal transaction

            //GENERATE TRANSACTION POLYMORPHICALLY

            //transaction[k] = new order(...)
            //transaction[k] = new Sale(...)
            //transaction[k] = new Return(...)
            //transaction[k] = new Purchase(...)

            //transaction[].makeTransaction();
        }
    }
    
}
