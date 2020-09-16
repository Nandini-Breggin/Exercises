/*
During a sale at a store, a 10% discount is applied to purchases over $10.00.
Write a program that asks for the amount of a purchase, then calculates the discounted price.
The purchase amount will be input in cents (as an integer):

Enter amount of purchases:
2000
Discounted price: 1800
Use integer arithmetic throughout the program. 
**/

import java.util.Scanner;
import java.lang.Math;

public class Discount {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of purchase (dollars): ");
        double amount = input.nextDouble();

        if (amount > 10) {

            double d = amount / 10.00;
            double discount = amount - d;
            System.out.println("*******************************");
            System.out.println("Amount of purchase : " + amount + " dollars");
            System.out.println("Discount price: " + discount + " dollars");
        } else {
            System.out.println("Amount of purchase : " + amount + " dollars");
        }


        
    

    }


}