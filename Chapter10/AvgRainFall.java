import java.lang.Math;
import java.util.Scanner;

public class AvgRainFall
{  
    static double april_value = 0.0;
    static double may_value = 0.0;
    static double june_value = 0.0;
    static double avg_value = 0.0;
  public static void main (String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is the average rainfall for April?");
    String a = scanner.nextLine();

    april_value = Double.parseDouble(a);

    System.out.println("What is the average rainfall for May?");
     a = scanner.nextLine();

    may_value = Double.parseDouble(a);

    System.out.println("What is the average rainfall for June?");
     a = scanner.nextLine();

    june_value = Double.parseDouble(a);

    avg_value = ((april_value + may_value + june_value) / 3);


    System.out.println("The average rain fall in the months of April, May and June is: " + avg_value);
  }
}





/**
 
Rainfall for April:  12
Rainfall for May  :  14
Rainfall for June:   8
Average rainfall:    11.333333

*/