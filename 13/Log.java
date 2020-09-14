import java.util.Scanner;
import java.lang.Math;

public class Log {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Double: ");
        Double num = input.nextDouble();
        Double log = (Math.log(num)/Math.log(2));

        System.out.println( "Base 2 log of " + num + " is " + log);
    }
}