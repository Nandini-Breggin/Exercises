import java.util.Scanner;
import java.lang.Math;

public class Ohm {

	public static void main( String [] args ) {
		Scanner input = new Scanner( System.in );

		System.out.print( "Enter the voltage: " );
		int voltage = input.nextInt();
		System.out.print( "Enter the resistance: " );
		int resistance = input.nextInt();
		System.out.println( "Current: " + (voltage + 0.0 ) / resistance + " amps");

	}

}