public class MaxElement {

    public static void main(String[] args) {

        // Finds the largest number out of the entire array.
        int[] arr1 = new int[]{3, 6, 9, 13, 14, 12};
        int[] arr2 = new int[]{456, 8, 12, 15, 21, 44};
        int[] arr3 = new int[]{15};
        int[] arr4 = new int[]{45, 45};

        System.out.println(max(arr1)); // 14
        System.out.println(max(arr2)); // 456
        System.out.println(max(arr3)); // 15
        System.out.println(max(arr4)); // 45
    }

    public static int max(int[] array) {
        // recursion #2
       return max(array, array.length - 1);
    }

    public static int max(int[] array, int index) {

        // base case
        if (index > 0) {
            return Math.max(array[index], max(array, index - 1));
        }

        // recursion #1
        return array[0];

    }

    
}
