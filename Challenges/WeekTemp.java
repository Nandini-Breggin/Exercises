import java.lang.Math;
import java.util.Scanner;

public class WeekTemp {
    

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("When you enter the temperature, please round it to the nearest degree in Fahrenheit.");
        
        System.out.println("What is the temperature on Sunday?");

        int sunday = scanner.nextInt();
        System.out.println("What is the temperature on Monday?");
        
        int monday = scanner.nextInt();
        System.out.println("What is the temperature on Tuesday?");

        int tuesday = scanner.nextInt();
        System.out.println("What is the temperature on Wednesday?");

        int wednesday = scanner.nextInt();
        System.out.println("What is the temperature on Thursday?");

        int thursday = scanner.nextInt();
        System.out.println("What is the temperature on Friday?");

        int friday = scanner.nextInt();
        System.out.println("What is the temperature on Saturday?");

        int saturday = scanner.nextInt();

        scanner.close();

        double avg = (sunday + monday + tuesday + wednesday + thursday + friday + saturday)/ 7.0;
        
        System.out.println("The average temperature is: " + avg);
        System.out.println("The temperature on Sunday is: " + sunday);
        System.out.println("The temperature on Monday is: " + monday);
        System.out.println("The temperature on Tuesday is: " + tuesday);
        System.out.println("The temperature on Wednesday is: " + wednesday);
        System.out.println("The temperature on Thursday is: " + thursday);
        System.out.println("The temperature on Friday is: " + friday);
        System.out.println("The temperature on Saturday is: " + saturday);
        
    }

}
