// THIS IS THE EXERCISES 2 AND 3 FROM CHAPTER 9 IN THE TEXTBOOK!

import java.lang.Math;
import java.util.Scanner;

public class Quadratic
{  
 static double x = 0.0;
 static double y = 0.0;
  public static void main (String[] args) {
    
/** 
    Scanner scanner = new Scanner(System.in);

    System.out.println("What value of x would you like to use for the quadratic equation: 3x^2-8x+4?");
    String  value = scanner.nextLine();

    x = Double.parseDouble(value);
*/

    // x = new Double(value).doubleValue();
    for (int i = 0; i < 5; i++)
    {
        x = new Double(i).doubleValue();
        y = (3 * Math.pow(x, 2) - (8 * x) + 4);
        System.out.println("The value of x : " + x + " and value of the Quadratic is: " + y);
    }
    
    
    
  }
}



/** 
Say that you are interested in the value of the quadradic

3X^2 - 8X + 4
For several values of X. Write a program that has a double precision variable X. Assign a value to it.
Write statement that computes a value for the quadradic and stores the result in another double precision variable.
Finally write out the result, something like:

At X = 4.0 the value is 20.0

Run the program with several values for X (edit the program for each value of X) and examine the result.
Use values with decimal points, large values, small values, negative values, and zero.
Solve the equation with paper and pencil (use the quadradic formula.)
The quadradic should evaluate to zero at X = 2.0 and at X = 2/3.
Try these values for X. Are the results exactly correct?



What value of x would you like to use for the quadratic equation: 3x^2-8x+4?
0
The value of x : 0.0 and value of the Quadratic is: 4.0

What value of x would you like to use for the quadratic equation: 3x^2-8x+4?
-8
The value of x : -8.0 and value of the Quadratic is: 260.0

What value of x would you like to use for the quadratic equation: 3x^2-8x+4?
99999993
The value of x : 9.9999993E7 and value of the Quadratic is: 2.9999995000000204E16

What value of x would you like to use for the quadratic equation: 3x^2-8x+4?
2.2   
The value of x : 2.2 and value of the Quadratic is: 0.9200000000000017


What value of x would you like to use for the quadratic equation: 3x^2-8x+4?
2/3
The value of x : 0.0 and value of the Quadratic is: 4.0

What value of x would you like to use for the quadratic equation: 3x^2-8x+4?
2.0
The value of x : 2.0 and value of the Quadratic is: 0.0
*/