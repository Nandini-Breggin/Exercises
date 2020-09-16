import java.util.Scanner;
import java.lang.Math;

public class OrderCheck {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of bolts purchased: ");
        double bolts = input.nextDouble();

        System.out.println("Enter amount of nuts purchased: ");
        double nuts = input.nextDouble();

        System.out.println("Enter amount of washers purchased: ");
        double washers = input.nextDouble();

        double b = 5.0 * bolts;
        double n = 3.0 * nuts;
        double w = 1.0 * washers;
        double total = b + n + w;

        if (nuts < bolts) {
            System.out.println("Check the Order: too few nuts.");
        } else if (washers < bolts) {
            System.out.println("Check the Order: too few washers.");
        } else {
            System.out.println("Order is ok.");
        }

        System.out.println("Total Cost: " + total);

    }


}
/*

} else if (bolts < nuts) {
    System.out.println("Check the Order: too many bolts.");
} else if (bolts < washers) { 
    System.out.println("Check the Order: too many bolts.");

**/