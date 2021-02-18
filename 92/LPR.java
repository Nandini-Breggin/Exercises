public class LPR {

    public static void main (String[] args) {
        System.out.println(lpr(45, 14)); // 3
        System.out.println(lpr(30, 10)); // 0
        System.out.println(lpr(14, 45)); // 14
        System.out.println(lpr(-25, 10)); // 5
    }

    public static int lpr(int a, int b) {
        if (a < b && a >= 0) {
            return a;
        }

        if (a >= b) {
            return lpr(a - b, b);
        }

        if (a < 0) {
            return lpr(a + b, b);
        }

        return 0;
    }
    
}
