import java.util.Scanner;

public class Substring {

	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println( "Enter a string:");
		String startString = input.nextLine();
		System.out.print( "Enter beginning index: ");
		int start = input.nextInt();
		System.out.print( "Enter ending index: ");
		int end = input.nextInt();

		System.out.println("Original string: ");
		System.out.println(startString);
		System.out.println("Substring: ");
		System.out.println(startString.substring(start, end) );

	}

}