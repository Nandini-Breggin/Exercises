import java.util.*;

public class UnluckyNumbers {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
		System.out.print("Enter a number: ");
        long num = input.nextLong();

        if (num < 0) {
            // ends code if it is a negative number
            System.exit(1);
        }

        if (isUnlucky(num)) {
            // if it does contain the number 13 then it is unlucky
            System.out.println(num + " is unlucky");


        } else if (!(isUnlucky(num))) {
            // else if it does not contain the number 13 then it is safe
            System.out.println(num + " is safe");
        }
        

        
	}

	public static boolean isUnlucky(long num) {

        String numFinder = String.valueOf(num);
        
		return numFinder.contains("13");
	}

}