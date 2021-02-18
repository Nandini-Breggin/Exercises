public class Pentagon {
    
    public static void main(String[] args) {
        System.out.println(Pent(1)); // 1
        System.out.println(Pent(2)); // 5
        System.out.println(Pent(3)); // 12
        System.out.println(Pent(4)); // 22
        System.out.println(Pent(5)); // 35
        System.out.println(Pent(100)); // 14950
    }

    public static int Pent(int n) {
        return (3 * n * (n-1)) / 2 + n;
    }
}
