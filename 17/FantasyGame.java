import java.util.Scanner;
import java.lang.Math;

public class FantasyGame {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );
        System.out.println("Welcome to Yertle's Quest!");
        
		System.out.print("Enter the name of your character: ");
        String name = input.nextLine();
        
		System.out.print("Enter strength (1-10): ");
        int strength = input.nextInt();
        
		System.out.print("Enter health (1-10): ");
        int health = input.nextInt();
        
		System.out.print("Enter luck (1-10): ");
		int luck = input.nextInt();

		if((strength + health + luck) >= 15) {
            System.out.println("You have give your character, " + name + ", too many points!");
            System.out.println("Default values have been assigned: ");
            System.out.println("Strength: 5, \nHealth: 5, \nLuck: 5" );
			strength = 5;
			luck = 5;
			health = 5;
		} else if ((strength + health + luck) < 15){
            System.out.println("Congrats! " + name + " has enough points to survive!");
        }

	}

}