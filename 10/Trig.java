// THIS IS EXERCISES 2 AND 3 FROM THE TEXTBOOK... EXERCISE 3 WANTED US TO EDIT EXERCISE 2

import java.lang.Math;
import java.util.Scanner;

public class Trig
{  
    static double sin = 0.0;
    static double cos = 0.0;
    static double square1 = 0.0;
    static double square2 = 0.0;
    static double sum = 0.0;
    static double degree = 0.0;
    static double radian = 0.0;
    
  public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("What is the sine value?");
    String s = scanner.nextLine();

    sin = Double.parseDouble(s);

    System.out.println("What is the cosine value?");
    String c = scanner.nextLine();

    cos = Double.parseDouble(c);
    
    square1 = (Math.pow(Math.sin(sin), 2));
    square2 = (Math.pow(Math.cos(cos), 2));

    sum = square1 + square2;


    System.out.println("Sine: " + sin + ", Cosine: " + cos + ", Sum of squares: " + sum);

    System.out.println("What is the degree of the angle?");
    String d = scanner.nextLine();

    degree = Double.parseDouble(d);

    radian = degree * Math.PI/180;

    System.out.println("Radian value of angle in degree: " + radian);

    radian = sin;
    radian = cos;

    System.out.println("Sine: " + sin + ", Cosine: " + cos + ", Sum of squares: " + sum);
    //"Sine value " + Math.sin(sin)
  }
}