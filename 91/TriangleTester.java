import java.util.*;

public class TriangleTester {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N, number of triangle layers: ");
        int N = scan.nextInt();

        if (N <= 0) {
            System.out.println("N must be greater than 0.");
        } else {
            System.out.println("Triangle (" + N + ") is " + Triangle(N));
        }
        

    }

    public static int Triangle(int N) {

        if (N == 1) {
            return 1;
        } else {
            return N + Triangle(N-1);
        }
    }
}