import java.util.Scanner;
import java.lang.Math;

public class GroundBeefValue {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the price/pound of package A: ");
        double price_a = input.nextDouble();
        System.out.println("Please enter the price/pound of package A: ");
        double percent_a = input.nextDouble();
        System.out.println("Please enter the price/pound of package A: ");
        double price_b = input.nextDouble();
        System.out.println("Please enter the price/pound of package A: ");
        double percent_b = input.nextDouble();

        double lean_a = (price_a / percent_a) * 100;
        double lean_b = (price_b / percent_b) * 100;

        System.out.println("**************************");
        System.out.println("Package A cost per pound of lean:" + lean_a);
        System.out.println("Package B cost per pound of lean:" + lean_b);
        System.out.println("**************************");


        if (lean_a > lean_b) {
            System.out.println("Package B is the best value.");
        } else {
            System.out.println("Package A is the best value.");
        }

    }


}
