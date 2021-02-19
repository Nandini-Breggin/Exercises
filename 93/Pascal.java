public class Pascal {
 
    public static void main (String[] args) {
        System.out.println(triangle(1, 1)); // 1
        System.out.println(triangle(6, 5)); // 6
        System.out.println(triangle(2, 1)); // 2
        System.out.println(triangle(5, 2)); // 10
    }

    public static int triangle(int row, int column) {
        if (column == 0) {
            return 1;
        }

        if (row == column) {
            return 1;
        }

        return triangle(row - 1, column - 1) + triangle(row - 1, column);
    }
}
