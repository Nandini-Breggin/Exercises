import java.util.Arrays;
import java.util.*;

public class ArrayAlg {
    public static void main(String[] args) {

        int[] haystack = { 1, 4, 2, 5, 3, 5, 333 };
        
        System.out.println("\nSearching haystack:\n");
        search(haystack, 15); // -1
        search(haystack, 5); // 3
        search(haystack, 333); // 6

        int [] test = {};

        System.out.println("\nSearching 2nd haystack:\n");
        search(test, 15); // -1
        search(test, 5); // -1
        search(test, 333); // -1

        System.out.println("\n---------------");
        System.out.println("\nSort:");

        int[] sorter = { 4, 5, 333, 4345242, 534534523, 542432432, 6 };
        
        System.out.println("\nOriginal Data: " + Arrays.toString(sorter));
        sort(sorter);

    }

    // Returns index of needle found in the haystack
    // BONUS: Linear. There isn't a faster way to solve the problem.
    public static int search( int[] haystack, int needle ) {


		for (int i = 0; i < haystack.length; i++) {

			if (needle == haystack[i]) {
                
                System.out.println(needle + " index: " + i);
                return i;
                
            }
            
        }

        System.out.println("-1: " + needle + " NOT FOUND!");
		return -1;
    
    }

    // Use swaps to rearrange the data to be in ascending order
    // BONUS: Linear. There isn't a faster way to solve the problem.
    public static int[] sort(int[] data) {

		int x; // temporary holding value, to store the values while being swaped

		for (int i = 0; i < data.length; i++) {

			for (int j = i + 1; j < data.length; j++) {
				
				if (data[i] > data[j] ) {

					x = data[i];
					data[i] = data[j];
					data[j] = x;
				}

			}

        }

        System.out.println("\nSorted Data: " + Arrays.toString(data));
		return data;

	}

}