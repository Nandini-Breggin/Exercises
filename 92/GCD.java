public class GCD {
    
    public static void main (String[] args) {
        System.out.println(gcd(3, 6)); // 3
        System.out.println(gcd(3, 7)); // 1
        System.out.println(gcd(3, 5)); // 1
        System.out.println(gcd(2, 12)); // 2
        System.out.println(gcd(3, 27)); // 3
        System.out.println(gcd(25, 55)); // 5
        System.out.println(gcd(6, 9)); // 3
    }

    public static int gcd(int n, int a) {
        if (a == 0) {
            return n;
        }

        if (n == 0) {
            return a;
        }

        return gcd(a, n % a);
    }
}
