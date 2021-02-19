public class ArraySum {
 
    public static void main (String[] args) {
                                 // 0  1  2  3  4  5 
        int[] testArray = new int[]{0, 1, 2, 3, 4, 5};
        System.out.println(sum(testArray, 0)); // 15
        System.out.println(sum(testArray, 1)); // 15
        System.out.println(sum(testArray, 2)); // 14
        System.out.println(sum(testArray, 3)); // 12
        System.out.println(sum(testArray, 5)); // 5
        System.out.println(sum(testArray, 11)); // 0
    }

    public static int sum (int[] array, int index) {
        if (index >= array.length) {
            return 0;
        }

        return array[index] + sum(array, index + 1);
    }

}
