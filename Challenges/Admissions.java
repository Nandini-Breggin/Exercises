import java.util.Scanner;

public class Admissions {

	public static void main( String [] args ) {
		
        Scanner input = new Scanner( System.in );
        
        System.out.print( "Enter your first name: " );
        String first_name = input.nextLine();

        System.out.print( "Enter your last name: " );
        String last = input.nextLine();

        System.out.print( "Enter your SAT Score (0-1600): " );
        int SAT = input.nextInt();

        System.out.print( "Enter your Class Rank Percentile: " );
        double rank = input.nextDouble();
        
		System.out.print( "Enter your Awards Earned (0-10+): " );
        int award = input.nextInt();
        
		System.out.print( "Where is your residence? (state): " );
        String residence = input.nextLine();
        

        //String SAT_rating = 0;
        //String class_rank = 0;
        //String award_rating = 0;
        //String residence_rating = 0;
        
        
        
		if (SAT >= 1500) { 
            System.out.print("Elite");
        } else if (SAT >= 1400) {
            System.out.print("Solid");
        } else if (SAT >= 1200) {
            System.out.print("Acceptable");
        } else {
            System.out.print("Nope");
        }

        if (rank >= 95) { 
			System.out.print("Elite");
        } else if (rank >= 90) {
            System.out.print("Solid");
        } else if (rank >= 85) {
            System.out.print("Acceptable");
        } else {
            System.out.print("Nope");
        }

        if (award >= 10) { 
			System.out.print("Elite");
        } else if (award >= 8) {
            System.out.print("Solid");
        } else if (award >= 3) {
            System.out.print("Acceptable");
        } else {
            System.out.print("Nope");
        }

        if (residence = "Colorado") { 
			System.out.print("Elite");
        } else if (residence = "Florida") {
            System.out.print("Nope");
        } else {
            System.out.print("Acceptable");
        }
        
        
        

    }
    

}