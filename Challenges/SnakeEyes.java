import java.lang.Math;
import java.util.Scanner;
import java.util.Random;


public class SnakeEyes {

	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
        Random rand = new Random();

		System.out.println("How many times do you want to roll the dice? ");
        double n = input.nextDouble();

        int i = 0;


        // chooses a random number from the 6 sides on the dice
        
		int first_dice = rand.nextInt(6) + 1;
        int second_dice = rand.nextInt(6) + 1;

        int sum_total = 0;
        
        int number_rolls = 0;
        
        int total_rolls = 0;
        
        int roll_four = 0; 


		while(i < n) { // Run it n number of times

			number_rolls = 0; // start from scratch

			do {

				total_rolls += 1; // add 1 to the total number of rolls made
				number_rolls += 1;
				sum_total += (first_dice + second_dice); // add the added numbers to the total sum

                first_dice = rand.nextInt(6) + 1;
		        second_dice = rand.nextInt(6) + 1;


            } while (first_dice != 1 && second_dice != 1);
            // while the numbers aren't equal to 1 for both: Snake Eyes

			if (number_rolls > 4) {
                // needed more than 4 rolls
                roll_four++;
            }

			i++; // adds to the number of times rolled

		}


		System.out.println("Average number of rolls: " + total_rolls / n);
		System.out.println("Average score: " + sum_total / n);
		System.out.println("% of plays with more than 4 rolls: " + roll_four / n * 100);


	}

}