import java.util.Scanner;
import java.lang.Math;

public class SequenceIntegers {

	public static void main( String [] args ) {
		
        Scanner input = new Scanner(System.in);
		
        
        System.out.print("Enter N: ");
        int n = input.nextInt();
        

        // int i = n;
        int count = 0;
        int sum = 0;

        sum = (n * (n + 1)) / 2;
        
        
        while (n > 0) { 

            // System.out.print(count + "\n");
            count = count + n;
            n--;
            

        }
        
        System.out.print("Loop Sum: " + count + "\n");
        System.out.print("Formula Sum: " + sum + "\n");

    }


}