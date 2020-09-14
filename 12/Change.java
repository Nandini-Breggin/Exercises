import java.util.Scanner;
import java.lang.Math;

public class Change {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );

		System.out.print( "Input the cents: " );
        int cents = input.nextInt();
        
        int dollar = cents / 100;
        int quarters = ( cents % 100 ) / 25;
        int dimes = ( ( cents % 100 ) % 25) / 10;
        int nickels = ( ( ( cents % 100 ) % 25) % 10 ) / 5;
        int pennies = ( ( ( cents % 100 ) % 25) % 10 ) % 5;

		System.out.println( "Your change is: " + dollar + " dollars and " + quarters + " quarters and " + dimes + " dimes and " + nickels + " nickels and " + pennies + " pennies.") ;

	}

}