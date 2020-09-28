import java.util.Scanner;
import java.lang.Math;

public class HarMean {
    public static void main (String [] args){

        // Resistance to Change - robust
        // if someone else changes the rest of the code,
        // it should work smoothly... work properly


        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = input.nextInt(); // should use double
        System.out.print("Enter y: ");
        int y = input.nextInt(); // should use double
        
        input.close();


        // 


        double arithmetic = (x + y) / 2;
        double harmean = 2 / ((1.0/ x ) + (1.0/ y ));

        System.out.println("Arithmetic mean: " + arithmetic);
        System.out.println("Harmonic mean: " + harmean);
    }
}