import java.util.Scanner;

public class SumRang {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter low: ");
		int low = input.nextInt();
		System.out.print("Enter high: ");
		int high = input.nextInt();

        
        // sum = (n * (n + 1)) / 2


		int sum = ( high * ( high + 1 ) / 2 ) - ( low * ( low + 1 ) / 2 ) + low;

		System.out.println("Sum = " + sum);

	}

}
