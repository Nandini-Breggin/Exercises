import java.util.Scanner;
import java.lang.Math;

public class IntegerRun {

	public static void main( String [] args ) {
		
        Scanner input = new Scanner( System.in );
		
		System.out.print("What is the start number? ");
        int start = input.nextInt();
        
        System.out.print("What is the end number? ");
        int end = input.nextInt();

        int count = start;
        
        while (count <= end) {
            System.out.print(count + "\n");
            

            count = count + 1;

        }


    }


}