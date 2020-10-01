import java.lang.Math;
import java.util.Scanner;
import java.util.Random;

public class MultiplicationQuiz {

	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		int n1;
		int n2;
		int correct = 0;
		int i = 0;

		while(i < 10) {
			n1 = rand.nextInt(9) + 1;
			n2 = rand.nextInt(9) + 1;
		
			System.out.print("What is " + n1 + " * " + n2 + "? ");
			
			if ((n1 * n2) == input.nextInt()) {
				System.out.println("Correct!");
				correct++;
			} else {
				System.out.println( "Incorrect: " + n1 + " * " + n2 + " = " + n1 * n2 );
            }
            
			i++;
		
		}

		System.out.println( "You got " + correct + " out of 10 questions correct!" );


	}

}