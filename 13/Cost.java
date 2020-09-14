import java.util.Scanner;
import java.lang.Math;

public class Cost {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter cost per kilowatt-hour in cents: ");
        double cents = input.nextDouble();
        System.out.print("Enter kilowatt-hours used per year: ");
        double hours = input.nextDouble();
        double cost = (cents * hours) / 100;
        System.out.println("Annual Cost: " + cost);
    }
}