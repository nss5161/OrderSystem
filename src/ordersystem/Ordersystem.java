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
        
        produceSampleCustomers();
    }

    private static void produceSampleCustomers() {
        Customer customer1 = new Customer(205, "John", "Smith", "536 Hill Road", "675-737-6473", "JSS@psu.edu");
        Customer customer2 = new Customer(205, "Tim", "Margret", "77 Bill Path", "984-812-6473", "TWH@psu.edu");
        Customer customer3 = new Customer(205, "Jan", "Spam", "216 Bark Road", "675-773-9023", "LLS@psu.edu");
        Customer customer4 = new Customer(205, "Will", "Pickle", "47 Tree Lane", "850-095-6473", "NID@psu.edu");
        Customer customer5 = new Customer(205, "Mary", "Goodwin", "949 Leaf Avenue", "006-623-6473", "YOU@psu.edu");
    }
    
}
