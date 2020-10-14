// N = 220/(1 + 10(0.83)t )

import java.lang.Math;
import java.util.Scanner;
import java.util.Random;


public class Sheep {

	public static void main(String [] args) {

        double N = 0; // number of sheep
        double power_t = 1; // t

        // int i = 0;
        
        
        for (int i = 0; i < 25;) { 
            // year number
            // for each variable under 25
            // run the loop and then add one to the year number

            N = 220 / (1 + 10 * power_t);


            System.out.println("Year: " + i + "\t Number of Sheep: " + (int)N);
            // n is an int because you can't have a part of a sheep
            
            if (N > 80) {
                // if sheep is greater than 80, then it doesn't need supervision

                System.out.println("The sheep herd can maintain itself without supervision after " + N + " years.");
            }

            i++;
            
            power_t *= 0.83; // This is what the power is mulitplied by
            
			
        }
        

    }

}
