import java.util.Scanner;

public class DogTester {

	public static void main( String [] args ) {

        Dog dog = new Dog("Lulu", "Terrier", 9);
		
        dog.play();
        if(dog.isHappy()) {
            System.out.println(dog.getName() + " is happy.");
        }
        
        System.out.println(dog);

        Object thing = new Dog("a", "b", 1);
        thing.toString();

        System.out.println(thing);

        doStuff(new Dog());
        doStuff(new Cat());

    }
    
    public static void println(Object whatToPrint) {
        whatToPrint.toString();
    }

    // polymorphism --> poly = many & morph = face

    public static void doStuff(Animal animal) {

    }


}