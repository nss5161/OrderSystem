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
public class Ordersystem{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        transaction[] transaction = new transaction[n];
        int transactionID;
        int orderSku;
        for(int k = 0; n - 1; k++){
            transactionID = k;
            orderSku = (int) Math.Random() * numberOfItems + 1;
            //look up sku in inventory file to get inventoryItem fields
            //gives you description onHand, unitcost, unitprice
            InventoryItem itemOrdered = new InventoryItem(put info in here);
            //logic to tell whether or not item is in stodck or not
            //if not in stock, cancel order
            //if in stock, completed roder, geneate sal transaction

            //GENERATE TRANSACTION POLYMORPHICALLY

            //transaction[k] = new order(...)
            //transaction[k] = new Sale(...)
            //transaction[k] = new Return(...)
            //transaction[k] = new Purchase(...)

            transaction[].makeTransaction();
        }
    }
    
}
