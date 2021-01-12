import java.util.Arrays;
import java.util.Random;
import java.util.*;

public class ComparisonSorts {

	public static Random random = new Random();
	public static final int NUM_TESTS = 5;
	public static final int TEST_DATA_SIZE = 10;
	public static final int RANDOM_RANGE = 100;
	
	public static void main( String[] args ) {
		
        int[] longer_list = { 23, 45, 555, 3424, 5242342, 3245, 345643, 22, 33, 3 };
        // [3, 22, 23, 33, 45, 555, 3245, 3424, 345643, 5242342]
        int[] shorter_list = { 3, 6, 9, 12, 345543, 123, 55 };
        // [3, 6, 9, 12, 55, 123, 345543]
        int[] list = { 1, 2, 3, 4, 5, 10000 };
        // [1, 2, 3, 4, 5, 10000]
        
        // Printing Original Data
		System.out.println("\nOriginal Data Set 1: " + Arrays.toString(longer_list));
        
        // System.out.println( "\n" );
		System.out.println("Original Data Set 2: " + Arrays.toString(shorter_list));
        
        // System.out.println( "\n" );
		System.out.println("Original Data Set 3: " + Arrays.toString(list));

        // Prints Selection Sort Function
        System.out.println("\nSELECTION SORT: ");
		System.out.println("Data 1: ");
        selectionSort(longer_list);

        // System.out.println( "\n" );
		System.out.println("Data 2: ");
        selectionSort(shorter_list);
        
        // System.out.println( "\n" );
		System.out.println("Data 3: ");
		selectionSort(list);

        // Prints Insertion Sort Function
        System.out.println("\nINSERTION SORT: ");
		System.out.println("Data 1: ");
        insertionSort(longer_list);

        // System.out.println( "\n" );
		System.out.println("Data 2: ");
        insertionSort(shorter_list);
        
        // System.out.println( "\n" );
		System.out.println("Data 3: ");
		insertionSort(list);

        // Prints Bubble Sort Function
        System.out.println( "\nBUBBLE SORT: " );
		System.out.println("Data 1: ");
        bubbleSort(longer_list);
        
        // System.out.println( "\n" );
		System.out.println("Data 2: ");
        bubbleSort(shorter_list);
        
        // System.out.println( "\n" );
		System.out.println("Data 3: ");
		bubbleSort(list);

		System.out.println( "\n\nTESTING CODE!!!" );
		testSort("SELECTION", NUM_TESTS);
		testSort("INSERTION", NUM_TESTS);
		testSort("BUBBLE", NUM_TESTS);

	}

	public static int[] selectionSort (int[] data) {

		for (int i = 0; i < data.length - 1; i++) {

            int x = i; // variable to store lowest number
            
			for (int j = i + 1; j < data.length; j++) {
				if (data[j] < data[x] ) {  
                    x = j;
                }
			}

            int smallest = data[x];
            
			data[x] = data[i];
			data[i] = smallest;

        }
        
        System.out.println(Arrays.toString(data));
		return data;

	}

	public static int[] insertionSort (int[] data) {

		for (int i = 1; i < data.length; i++) {

			int current_data = data[i];
			int x = i - 1;

			while (x >= 0 && data[x] > current_data) {
				data[x + 1] = data[x]; 
                x--; 
			}

			data[x + 1] = current_data;

        }
        
        System.out.println(Arrays.toString(data));
		return data;

	}

	public static int[] bubbleSort (int[] data) {

		for (int i = 0; i < data.length - 1; i++) {

			for ( int j = 0; j < data.length - i - 1; j++ ) {
				
				if (data[j] > data[j + 1] ) {
					
					int x = data[j]; 
                    data[j] = data[j + 1]; 
                    data[j + 1] = x; 
				
				}
			}

        }
        
        System.out.println(Arrays.toString(data));
		return data;

	}

	

	public static void testSort (String method, int times) {
		for (int test = 0; test < times; test++) {
			int [] data = createTestData(TEST_DATA_SIZE);
			int [] orig = duplicate(data);

			sortUsing(data, method);

			if (!isSortedAsc(data)) {
				printSortErrorMessage(method, data, orig);
				return;
			}
		}

		System.out.println("ALL TESTS ARE SORTED CORRECTLY FOR " + method + "\n");
	}

	public static void sortUsing (int[] data, String method) {
		if (method.toLowerCase().equals("selection")) {
			selectionSort(data);
		} else if (method.toLowerCase().equals("insertion")) {
			insertionSort(data);
		} else {
			bubbleSort(data);
		}

	}

	public static void printSortErrorMessage(String method, int[] data, int [] orig) {
		System.out.println("Error, during " + method);
		System.out.println("Original Data: ");
		print(orig);
		System.out.println("After sorting: ");
		print(data);
		System.out.println();
	}

	public static int[] createTestData(int amount) {
		int[] data = new int[amount];

		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(RANDOM_RANGE);
		}

		return data;
	}

	public static int[] duplicate(int[] data) {
		int[] dup = new int[data.length];

		for (int i = 0; i < data.length; i++) {
			dup[i] = data[i];
		}

		return dup;
	}

	public static void print(int[] data) {
		System.out.print("[");

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);

			if (i < data.length -1) {
				System.out.println(",");
			}
		}

		System.out.println("]\n");
	}

	public static boolean isSortedAsc(int[] data) {
		for (int i = 0; i <data.length - 1; i++) {
			if (data[i + 1] < data[i] ) {
				return false;
			}
		}

		return true;
	}

}