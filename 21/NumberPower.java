// Initialize the variable that will hold the result to 1.
// Then multiply it by X once per loop iteration.

import java.util.Scanner;
import java.lang.Math;

public class NumberPower {
    public static void main (String [] args){

    
        Scanner input = new Scanner(System.in);

        System.out.print("Enter X: ");
        float x = input.nextFloat(); 
        
        System.out.print( "Enter N: " );
        double n = input.nextDouble();

        double answer = 0;
        
        if (n < 0) {
            System.out.println("N must be a positive integer");
            System.exit(0);
        } else {
            answer = Math.pow(x, n);
        }

		
        // System.out.println("N must be a positive number");
        
		

		System.out.println( x + " raised to the power " + n + " is: " + answer); 
    }
}