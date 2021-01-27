import java.util.*;

public class AnimalTester {

    public static void main(String[] args) {
        // Which, if any, of the following declarations are legal? Why?
        // (TYPICAL QUESTION ON AP EXAM)

        // 0 Dog dog = new Dog("Spot", "Bulldog", 3);
        // 1 Dog dog = new Animal("Spot", "Bulldog", 3); // Type mismatch: cannot convert from Animal to Dog
        Animal dog = new Dog("Spot", "Bulldog", 3); // 2

        // ANSWER: 0 -> store a dog in a dog class
        //         2 -> looking at the structure, Animal is the parent class, dog inherits from the animal class
        //          because a dog in an animal, it works
        // words in () are assumed to be correct

        // cannot do #1 because an animal isn't always a dog -> can be a cat or tiger or lion

        // Dog is a(n) Animal

        // if (dog instanceof Dog) {
        //     Dog dog2 = (Dog)dog;
        //     dog2.fetch();
        // }


        a.speak(); // woof

        List<Animal> animals = new ArrayList<Animal>();

        animals.add(new Dog("Spot", "Bulldog", 3));
        animals.add(new Cat("Hairball", "Orange", 3));

        // for each loop syntax
        for (Animal animal : animals) {
            animal.speak(); // dynamic binding
        }

        List<Comparable> comp = new ArrayList<Comparable>();
        
    }

    public static foo(Animal animal) {
        
    }
}