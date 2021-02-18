public class Log {
    
    public static void main (String[] args) {
        System.out.println(log(32)); // 5
        System.out.println(log(8));
        System.out.println(log(100));
        System.out.println(log(48)); // 5
    }

    public static int log(int n) {
        if (n == 1) {
            return 0;
        }

        return 1 + log(n/2);
    }
}
