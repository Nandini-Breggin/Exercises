import java.util.Scanner;

public class CatTester {

	public static void main( String [] args ) {

        Cat cat = new Cat("Blue", "orange cat", 9);
		
        cat.play();
        if(cat.isHappy()) {
            System.out.println(cat.getName() + " is happy.");
        } else {
            System.out.println(cat.getName() + " is not happy.");
        }
        


	}


}