import java.util.Scanner;

public class OddSum {
	
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
		System.out.print("N: ");
        int n = input.nextInt();
        
		int sum = 0;
		int square = n * n; // instead of using power

        for (int i = 1; i <= n; i += 1) { // starts at one, then adds the number

            sum += i;

		}

		System.out.println("Sum of odds: " + sum);
		System.out.println("Square of N: " + square);
	}

}