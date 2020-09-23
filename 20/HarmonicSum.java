
import java.util.Scanner;

public class HarmonicSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter N: ");
        int N = input.nextInt();

        int i = 0;
        double sum = 0;

        // sum = 1.0/1 + 1.0/2 + 1.0/3 + 1.0/4 + 1.0/5 + .... + 1.0/N

        while (i < N) {
            sum += (1.0 / (i + 1));
            i++;
        }

        System.out.println("Sum is: " + sum);
    }
}  