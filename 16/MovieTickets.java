/*
Write a program that determines the price of a movie ticket (similar to the one in the chapter).
The program asks for the customer's age and for the time on a 24-hour clock (where noon is 1200 and
4:30 pm is 1630). The normal adult ticket price is $8.00, however the adult matinee price is $5.00.
Adults are those over 13 years. The normal children's ticket price is $4.00,
however the children's matinee price is $2.00. Assume that a matinee starts at any time earlier
than 5 pm (1700).

Get the information from the user and then use nested if statements to determine the ticket price.
It is usually a good idea to separate the "information gathering phase" (asking the user for age and time)
from the "processing phase" of a program (deciding on the ticket price).
There are many ways in which the if statements can be nested.
Sketch out a flowchart as you design your program.
**/

import java.util.Scanner;
import java.lang.Math;

public class MovieTickets {
    public static void main (String [] args) {

        Scanner input = new Scanner( System.in );
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Please choose a time. (military time: 1200 - noon) ");
        
        System.out.print("Enter the time chosen: ");
        int time = input.nextInt();
        double price; // Dollars
        
        if((age >= 13) && (time < 1700)) { // 13+ yrs adult & before 5pm is matinee
            price = 5.00;
        } 
        else if ((age <=13 ) && (time < 1700)) { // under 13 yrs child & before 5pm is matinee
            price = 2.00;
        } 
        else if ((age <= 13) && (time >= 1700)) { // under 13 yrs child & after 5pm is not matinee
            price = 4.00;
        } 
        else {
            price = 8.00; // normal adult ticket cost
        }

        System.out.println("The price of the movie ticket is: $" + price);

    }


}