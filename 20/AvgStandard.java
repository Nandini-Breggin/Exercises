import java.util.Scanner;
import java.lang.Math;

public class AvgStandard {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many integers will be added: ");
        int add = input.nextInt();

        int x = 0;
        double [] adds = new double[add];
        double sum = 0;
        double avgSquare = 0;

        while (x < add) {
            System.out.print("Enter an integer: ");
            double value = input.nextInt();
            adds[x] = value;
            sum += value;
            avgSquare += Math.pow(value, 2);
            x++;
        }

        double average = sum/add;
        avgSquare = avgSquare/add;

        double deviation = Math.sqrt(avgSquare - Math.pow(average, 2));

        System.out.println("Average: " + average);
        
        System.out.println("Standard Deviation: " + deviation);
        
    }
}