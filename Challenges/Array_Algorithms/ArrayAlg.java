// import java.util.Arrays;
// import java.util.*;

public class ArrayAlg {
    public static void main(String[] args) {

        int[] ogData = { 1, 4, 2, 5, 3, 5, 1010, 234, 23445, 32948 };

        System.out.println("\nSearching haystack:");
        search(ogData, 0); // 9
        
        System.out.println("\n");
    }

    // Returns index of needle found in the haystack
    // Constant or Linear?
    public static int search( int[] haystack, int needle ) {

		for (int i = 0; i < haystack.length; i++) {

			if (haystack[i] == needle) {
                // System.out.println(i);
                System.out.println("Test");
                System.out.println(haystack[i]);
				return i;
			}
        }
        
		return -1;
    
    }

    // public static int sort(int[] data) {

    // }
}