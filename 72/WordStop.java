import java.io.*;
import java.util.*;

public class WordStop {
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
        PrintWriter out = null;
        
		System.out.print("Name of file: ");
        String fileName = userInput.nextLine();
        
		Scanner in;

		try {

			out = new PrintWriter(new BufferedWriter(new FileWriter("WordRemover.txt")));
            in = new Scanner(new File(fileName));
            
			while (in.hasNext()) {

                String remove = in.nextLine();
                
				remove = removeWord(remove, "the");
				remove = removeWord(remove, "an");
				remove = removeWord(remove, "a");
				remove = removeWord(remove, "hi");
				remove = removeWord(remove, "because");
				out.write(remove);
			}

			out.close();
			in.close();
		}
		catch( Exception e ) {
			e.printStackTrace();
		}

	}

	public static String removeWord (String string, String word) {

		String removeWord = word + " ";
		string = string.replaceAll(removeWord, "");

		removeWord = " " + word;
		string = string.replaceAll(removeWord, "");

		return string; 
	}

}