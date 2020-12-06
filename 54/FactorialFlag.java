import java.util.*;

public class FactorialFlag {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);


        long num;
        System.out.print("Enter an integer (0-20): ");
        num = scanner.nextLong();

        long fact = factorial(num);

        if (fact == -1) {
            System.out.println("Error Flag: -1");
            System.out.println("Your input is incorrect. The number must be an integer from 0-20.");
        } else {
            System.out.println(fact);
        }
    }


    public static long factorial(long num) {
        if (num > 20 || num < 0) {
            return -1;
        }
        
        long sum = 1;

        for (long n = num; n > 1; n--) {
            
            sum *= n;

        }

        return sum;
    }   
}