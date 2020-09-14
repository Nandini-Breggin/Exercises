import java.util.Scanner;
import java.lang.Math;

public class Brick {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        Double seconds = input.nextDouble();

        Double distance = (0.5)* 32.174 *Math.pow(seconds,2);

        System.out.println("Distance: " + distance + " feet");

        // Seconds: 100
        // Distance: 160870.0 feet
    }
}