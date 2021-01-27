public class Dog extends Animal {

    public Dog (String name, String breed, int age) {
        super(name, breed, age); // calling the animal constructor
    }

    public boolean isHappy() {
        return hasSlept() || hasEaten() || hasPlayed();
    }

    // ALL OF THIS IS IN THE Animal.java -> Inheritance that is the same for the dog and cat

	// private String name, breed;
	// private int age;
	// private boolean hasEaten, hasSlept, hasPlayed;
	
    
    // public Dog (String name, String breed, int age) {
    //     this.name = name;
    //     this.breed = breed;
    //     this.age = age;
    // }


    // public String getName() {
	// 	return this.name;

    // }

    // public String getBreed() {
	// 	return this.breed;

    // }

    // public int getAge() {
	// 	return this.age;

    // }

    // public void sleep() {
    //     this.hasSlept = true;
    // }

    // public void eat() {
    //     this.hasEaten = true;
    // }

    // public void play() {
    //     this.hasPlayed = true;
    // }

    // public boolean hasSlept() {
    //     return this.hasSlept;
    // }
    
    // public boolean hasEaten() {
    //     return this.hasEaten;
    // }

    // public boolean hasPlayed() {
    //     return this.hasPlayed;
    // }

    public void fetch() {
        
    }

    public String speak() {
        return "woof!";
    }

    

}