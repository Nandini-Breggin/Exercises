import java.util.Scanner;
import java.lang.Math;

public class HarMean {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = input.nextInt();
        System.out.print("Enter y: ");
        int y = input.nextInt();

        double arithmetic = (x+y)/2;
        double harmean = 2/((1.0/x)+(1.0/y));

        System.out.println("Arithmetic mean: " + arithmetic);
        System.out.println("Harmonic mean: " + harmean);
    }
}