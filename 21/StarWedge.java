import java.util.Scanner;
import java.lang.Math;

public class StarWedge {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );

		System.out.print( "Initial number of stars: \n" );
        int stars = input.nextInt();
        
        

        while(stars > 0) {
            int i = 0;

			while(i < stars) {

				System.out.print("*");
                i++;
                //System.out.print("*");
                
			}
			
			System.out.println("");
			stars--;

		}

	}

}