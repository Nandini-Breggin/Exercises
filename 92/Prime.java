public class Prime {
    
    public static void main(String[] args) {
        System.out.println("The folowing are or aren't prime numbers.");
        System.out.println("12: \t" + prime(12, 2)); // f
        System.out.println("5: \t" + prime(5, 2)); // t
        System.out.println("2: \t" + prime(2, 2)); // t
        System.out.println("11: \t" + prime(11, 2)); // t
        System.out.println("664: \t" + prime(664, 2)); // f
        System.out.println("1: \t" + prime(1, 1)); // f

    }

    public static boolean prime(int n, int a) {
        if (n == 1) {
            return true;
        }
        
        if (n <= 2) {
            return (n == 2 ? true : false);
        }

        if (n % a == 0) {
            return false;
        }

        if (a * a > n) {
            return true;
        }

        return prime(n, a + 1);
    }
}
