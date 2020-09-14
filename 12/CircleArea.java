import java.util.Scanner;
import java.lang.Math;

public class CircleArea {  
    
    
  public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Radius: ");
    int r = input.nextInt();
    System.out.println("The radius is:" + r + "The area is: " + (Math.PI*Math.pow(r,2)));

    // area =  pi * r^2

    // System.out.println("Input radius: " + radius);
    // System.out.println("The radius is: " + radius + "The area is: " + area);

  }
}



