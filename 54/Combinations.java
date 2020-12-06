import java.util.Scanner;

public class Combinations{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = scan.nextInt();

        if (n > 20) {
            System.out.println("Please enter a number, n, under 20.");
            System.exit(1);
        }

        System.out.println("Enter r: ");
        int r = scan.nextInt();

        if (r > n) {
            System.out.println("Please enter a number, r, under " + n);
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