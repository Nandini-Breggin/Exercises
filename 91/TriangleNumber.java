public class TriangleNumber {
    
    public static void main (String[] args) {

        System.out.println(triangleNumber(1)); // 1
        System.out.println(triangleNumber(2)); // 3
        System.out.println(triangleNumber(3)); // 6
        System.out.println(triangleNumber(4)); // 10
        System.out.println(triangleNumber(5)); // 15
        System.out.println(triangleNumber(6)); // 21
        System.out.println(triangleNumber(100)); // 21
    }

    public static int triangleNumber(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n % 2 == 1) {
            return 3 * triangleNumber(n/2) + triangleNumber((n/2) + 1);
        } else  {
            return 3 * triangleNumber(n/2) + triangleNumber((n/2) - 1);
        }
            

        
    }
}
