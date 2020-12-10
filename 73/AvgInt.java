import java.io.*;
import java.util.*;

public class AvgInt {
	
	public static void main(String[] args) {
	
		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter 'quit' to exit. ");
		System.out.print("File name: ");
		String fileName = userInput.nextLine();

		while (!fileName.equals("quit")) {

			try {
				System.out.println(findingAvg(fileName));

			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.print("Enter 'quit' to exit. ");
			System.out.print("File name: ");
			fileName = userInput.nextLine();

		}


	}

	public static double findingAvg(String fileName) throws Exception {

		Scanner in = new Scanner(new File(fileName));
		double sum = 0;
        int counter = 0;
        
        

		while (in.hasNextDouble()) {
            sum += in.nextDouble();
            counter++;

		}

        return sum / counter;


        // double totalsum = 0;
        
        // if (fileName.equals( "quit" ) {

        //     double totalsum = sum;
        //     double totalsum++;
        //     return totalsum;
        // } 
        
        

	}

}