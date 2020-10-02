import java.util.Scanner;

public class DrugPotency {

	public static void main(String [] args) {
		
		double effect = 100; // percent
        int month = 0; // goes down 4% a month
        
		while(effect > 50) {

			System.out.print("\nMonth: " + month + "\tEffectiveness: " + effect);
			month++;
			effect *= 0.96; // multiply by 96% instead of loosing 4%

		}

        System.out.println("\n Month: " + month + "\tEffectiveness: " + effect + "\t DISCARDED\n");
        
        System.out.println("\nIt takes " + month + " months to become discarded");


	}

}