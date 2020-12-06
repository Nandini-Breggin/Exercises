import java.util.Scanner;

public class Combinations{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = scan.nextInt();

        if (n > 20 || n < 0) {
            System.out.println("Error Flag: -1");
            System.out.println("N must be 20 or under.");
            System.exit(1);
        }

        System.out.println("Enter R: ");
        int r = scan.nextInt();

        if (r > n || r < 0) {
            System.out.println("Error Flag: -1");
            System.out.println("R must less than or equal to N");
            System.exit(1);
        }

        

        System.out.println(n + "C" + r + ": " + combo(n, r));
    }

    
    
    public static long factorial(int num) {

        

        long fact = 1;

        for (int i = 1; i <= num; i++){
            fact *= i;
        }
        return fact;
    }

    public static long combo(int n, int r) {
        return (factorial(n) / (factorial(r) * factorial(n - r)));

        // nCr = n! / (r!*(n-r)!)
    }

    
}