import java.io.*;
import java.util.*;

public class AvgStandard {
	
	public static void main( String [] args ) {
		
        Scanner userInput = new Scanner( System.in );
        
		System.out.print("What is the file name? ");
		File file = new File(userInput.nextLine());
		double sum = 0; // sum
		double sumSQ = 0; // sum squared
		int number = 0;
		Scanner in;

		try {
			in = new Scanner(file);
			while(in.hasNextDouble()) {

				double temp = in.nextDouble();
				sum += temp;
				sumSQ += temp * temp;
				number++;
			}
		}
		catch( Exception e ) {
			e.printStackTrace();
		}
		finally {
			double avg = sum / number;
			double avgSQ = sumSQ / number;
			double variation = avgSQ - (avg * avg);
			System.out.println("Avgerage: " + avg );
			System.out.println("Standard Deviation: " + Math.sqrt(variation) );
		}

	}

}