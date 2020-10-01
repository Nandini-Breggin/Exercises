import java.util.Scanner;
import java.lang.Math;

public class SquaresCubes {
    public static void main (String [] args){

    
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the upper limit: ");
        int n = input.nextInt(); 
        
        int squares = 0;
        int cubes = 0;
        int i = 0;

        // insert loop here

        while( i <= n ) {

			squares += Math.pow(i, 2);
			cubes += Math.pow(i, 3);
			i++;

		}


       // ********************
       // using equation

        double square = n * (n + 1) * ((2 * n) + 1) / 6;
        double cube = Math.pow(n, 2) * Math.pow ((n + 1), 2) / 4;

        System.out.println("Upper Limit: \n" + n);
        System.out.println("(Loop) The sum of Squares is " + squares);
        System.out.println("(Loop)The sum of Cubes is " + cubes);
        System.out.println("\n(Formula) The sum of Squares is " + square);
        System.out.println("(Formula) The sum of Cubes is " + cube);
    }
}