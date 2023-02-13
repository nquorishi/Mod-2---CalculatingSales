/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculatingsales;

/**
 *
 * @author inaquout
 */
import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double totalRetailValue = 0.0;
        int productNumber = 0;
        
        while (productNumber != -1) {
            System.out.print("Enter the product number (1-5) or -1 to quit: ");
            productNumber = input.nextInt();
            
            if (productNumber != -1) {
                System.out.print("Enter the quantity sold: ");
                int quantitySold = input.nextInt();
                
                double retailPrice = 0.0;
                if (productNumber == 1) {
                    retailPrice = 2.98;
                } else if (productNumber == 2) {
                    retailPrice = 4.50;
                } else if (productNumber == 3) {
                    retailPrice = 9.98;
                } else if (productNumber == 4) {
                    retailPrice = 4.49;
                } else if (productNumber == 5) {
                    retailPrice = 6.87;
                } else {
                    System.out.println("Invalid product number. Please enter a number from 1 to 5.");
                    continue;
                }
                
                double productRetailValue = retailPrice * quantitySold;
                totalRetailValue += productRetailValue;
            }
        }
        
        System.out.printf("Total retail value of all products sold: $%.2f\n", totalRetailValue);
    }
}
