import java.util.Arrays;
import java.util.*;

public class ComparisonSorts {
	
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

}