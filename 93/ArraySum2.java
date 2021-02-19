public class ArraySum2 {
 
    public static void main (String[] args) {
                                 // 0  1  2  3  4  5 
        int[] testArray = new int[]{0, 1, 2, 3, 4, 5};
        System.out.println(sum(testArray));

                                 // 0  1  2  3  4  5 
        int[] testArray2 = new int[]{0, 1, 2, 3, 4, 25};
        System.out.println(sum(testArray2));
    }

    public static int sum (int[] array) {
        return sum(array, 0);
    }

    public static int sum (int[] array, int index) {
        if (index >= array.length) {
            return 0;
        }

        return array[index] + sum(array, index+1);
    }

}
