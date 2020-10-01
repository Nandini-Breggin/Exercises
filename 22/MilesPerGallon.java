import java.lang.Math;
import java.util.Scanner;

public class MilesPerGallon {

	public static void main(String [] args) {
		
        Scanner input = new Scanner(System.in);
        
		System.out.println("Initial miles: " );
        int start = input.nextInt();

        if (start < 0) {
			System.out.println("\n bye");
            System.exit(0);
        }

        System.out.println("Final miles: " );
        int end = input.nextInt();

        System.out.println("Gallons: " );
        int gallons = input.nextInt();

        double miles = 0;

		
		if (end < start) {
            System.out.println("Not possible. Please try again.");
            System.exit(0);
        } else {
            miles = (end - start) / gallons;
        }
            
		System.out.println("Miles per Gallon: " + miles);


	}

}