import java.io.*;
import java.util.*;

public class NumberFilter {
	
	public static void main(String[] args) {
		
		Scanner in = null;
		PrintWriter outNegative = null;
        PrintWriter outPositive = null;
        
		Scanner userInput = new Scanner( System.in );

		System.out.print( "File with the numbers: " );
        String numberFile = userInput.nextLine();
        
		System.out.print( "Positive number file: " );
        String positiveFile = userInput.nextLine();
        
		System.out.print( "Negative number file: " );
		String negativeFile = userInput.nextLine();

		try {
            in = new Scanner(new File(numberFile));
            
			outNegative = new PrintWriter(new BufferedWriter(new FileWriter(negativeFile)));
            outPositive = new PrintWriter(new BufferedWriter(new FileWriter(positiveFile)));
            

			while(in.hasNextInt()) {
                int num = in.nextInt();
                
				if(num < 0) {
					outNegative.write("" + num + "\n");
				} else {
					outPositive.write("" + num + "\n");
				}
			}

			outPositive.close();
			outNegative.close();
		} catch( Exception e ) {
			e.printStackTrace();
		}

	}

}