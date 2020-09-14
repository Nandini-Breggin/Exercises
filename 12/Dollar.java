import java.util.Scanner;
import java.lang.Math;

public class Dollar {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print( "Input the cents: " );
        int cents = input.nextInt();

        System.out.println( "That is " + cents / 100 + " dollars and " + cents % 100 + " cents." );
    }
}