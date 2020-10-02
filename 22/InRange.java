import java.lang.Math;
import java.util.Scanner;


public class InRange {

	public static void main(String [] args) {
		
        Scanner input = new Scanner( System.in );
		
		System.out.print("Low end of range: ");
		int low = input.nextInt();

        System.out.print("High end of range: ");
        int high = input.nextInt();
        
        System.out.print("Range: " + low + " <= n <= " + high); // prints the range

		int data;
		int in_sum = 0;
        int out_sum = 0;
        
        System.out.print("\nIf you want to exit the loop, enter 0.\n");

        do { // do while loop: if the code is 'true' then do this code.
        // condition is checked after loop is done
			
			System.out.print("Enter data: ");
			data = input.nextInt(); // this gets repeated until 0 is entered to stop it.

            if (data == 0) break; // break: ends this section of the loop when 0 is entered for the data
            
			if (data >= low && data <= high) {
				in_sum += data; // inclusive
			} else {
				out_sum += data; // exclusive
			}

		} while(true);

		System.out.println("Sum of in range values: " + in_sum);
		System.out.println("Sum of out of range values: " + out_sum); 

            
		


	}

}
