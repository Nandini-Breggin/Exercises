import java.util.Arrays;
// import java.util.*;

public class ArrayAlg {
    public static void main(String[] args) {

        int haystack[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 333};

        
        search(haystack, 3); // 9
        
        System.out.println("\n");
    }

    // Returns index of needle found in the haystack
    // Constant or Linear?
    public static int search(int[] haystack, int needle) {

        int num = 0;

        for (int i = 0; i < haystack.length; i++) {
            
            // System.out.print(i);
            if (needle == haystack[i]); {
                System.out.println("\nSearching haystack:");
                num++;
                System.out.println("There is " + num + ", " + needle);
                System.out.println(i);
                // return i;
                
            }
            
            return i;
    
        }
        return -1;
        
    }

    // public static int sort(int[] data) {

    // }
}