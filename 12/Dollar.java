import java.util.Scanner;
import java.lang.Math;

public class Dollar {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print( "Input the cents: " );
        int cents = input.nextInt();

        int dollar = cents / 100;

        int change = cents % 100;

        System.out.println( "That is " + dollar + " dollars and " + change + " cents." );
    }
}