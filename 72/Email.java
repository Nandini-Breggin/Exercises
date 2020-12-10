import java.io.*;
import java.util.*;

public class Email {
	
	public static void main(String[] args) {
		
        Scanner userInput = new Scanner( System.in );
        
		System.out.print( "What is the file name? " );
        String fileName = userInput.nextLine();
        
		PrintWriter out = null;
		Scanner in = null;

		try {
			in = new Scanner( new File(fileName));
            out = new PrintWriter(new BufferedWriter(new FileWriter("EmailExtractor.txt")));
            
			while(in.hasNext()) {
                String token = in.next();
                
				if (token.lastIndexOf('@') + 1 < token.lastIndexOf('.')) {
                    // finding the @ symbol in relation to the .'net' of the email
					out.write(token + "\n");
				}
            }
            
			out.close();
		} catch( Exception e ) {
			e.printStackTrace();
		}

	}

}