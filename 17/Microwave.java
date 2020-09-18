import java.util.Scanner;
import java.lang.Math;

public class Microwave {

	public static void main( String [] args ) {
		
        Scanner input = new Scanner( System.in );
		
		System.out.print("How many items do you want to heat: ");
		int items = input.nextInt();
		System.out.print("Time for one item: ");
		int time = input.nextInt();

		int minutes = time / 100;
        int seconds = time % 100;
        
        //int total_seconds = 0;

        int min_2 = 0;
        int sec_2 = 0;

        int total_seconds = (int)(60 * minutes) + seconds;


        // System.out.println(total_seconds);
        System.out.println("Item:" + items);
        System.out.println("Time: " + time);
        //System.out.println("Heat for " + minutes + " minutes " + seconds + " seconds");
        


		if (items == 1) {
			System.out.println("Heat for " + minutes + " minutes " + seconds + " seconds");
		} else if (items > 1) {
            min_2 =  (total_seconds * items) / 60;
            sec_2 = (total_seconds * items) % 60;
            System.out.println("Heat for " + min_2 + " minutes " + sec_2 + " seconds");
        }
        

    }


}

 /*
else if (items == 2) {
    total_seconds = total_seconds + total_seconds/2;
    System.out.println("Heat for " + total_seconds / 60 + " minutes " + total_seconds % 60 + " seconds");
}
else if (items == 3 ) {
    total_seconds = total_seconds * 2;
    System.out.println("Heat for " + total_seconds / 60 + " minutes " + total_seconds % 60 + " seconds");
**/