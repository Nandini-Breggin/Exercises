import java.io.*;
import java.util.*;

public class SeparateSum {
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner( System.in );

		int yEquations = 0;
		int xEquations = 0;

		try {
			System.out.print("What is the file name? ");
            Scanner in = new Scanner(new File(userInput.nextLine()));
            
			while(in.hasNext()) {

				if (in.hasNext("x=")) {
					in.next();
                    xEquations += in.nextInt();
                    
				} else { // y = "" equations
					in.next();
					yEquations += in.nextInt();
				}
			}

			System.out.println("x: " + xEquations);
            System.out.println("y: " + yEquations);
            
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}