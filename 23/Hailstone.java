import java.util.Scanner;
import java.lang.Math;

public class Hailstone {

	public static void main(String [] args) {
		
        Scanner input = new Scanner(System.in);
        
        int num_steps = 0; // number of steps
        
		System.out.print("N: ");
		int n = input.nextInt(); // starting number

		while(n != 1) { // while the number isn't 1, run the loop

            System.out.println(n); // prints the value before the process starts
            
			if(n % 2 == 0) {  // even identity: percent
                n /= 2; // divide by 2 for even value
            } else { 
                n = 3 * n + 1; // odd identity: odd value
            }

			num_steps++;

		}
		System.out.println("To reach 1, it took " + num_steps + " steps.");

	}

}