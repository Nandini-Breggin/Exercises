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

        
        System.out.println("\n");
    }

    // Returns index of needle found in the haystack
    // BONUS: Linear. There isn't a faster way to solve the problem.
    public static int search( int[] haystack, int needle ) {


		for (int i = 0; i < haystack.length; i++) {
            // System.out.println("Test");

			if (needle == haystack[i]) {
                // i++;
                // System.out.println(i);
                // System.out.println("Check");
                // System.out.println(haystack[i]);
                System.out.println(needle + " index: " + i);
                return i;
                
            }
            // break;
        }

        System.out.println("-1: " + needle + " NOT FOUND");
		return -1;
    
    }

    // public static int sort(int[] data, int first, int middle, int last) {
        // works with array at length 3 -> start with that, and then can expand

    // }
}