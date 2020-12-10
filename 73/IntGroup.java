import java.io.*;
import java.util.*;

public class IntGroup {
	
	public static void main(String[] args) {
		
        Scanner in;
        Scanner userInput = new Scanner( System.in );
        
		System.out.print( "File name? " );
        String fileName = userInput.nextLine();
        
		int groupcounter = 0;

		try {

			in = new Scanner(new File(fileName));
            String line = in.nextLine();
            
            int sum = 0;
            
			while (in.hasNextLine()) {

				if (!in.hasNext("next")) {
                    sum += in.nextInt();
                    
				} else {
					    groupcounter++; // counts what group it is on
                        System.out.println("Sum of group #" + groupcounter + " is: " + sum);
                        if (sum == 0) {
                            System.out.println("There is no data in group #" + groupcounter);
                        }
					    sum = 0; // resets the sum for the next group
                        in.next();
				}
            }
            
            System.out.println("Sum of group #" + (groupcounter + 1) + " is: " + sum);
            
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}