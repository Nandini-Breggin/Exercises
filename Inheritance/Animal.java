// package Exercises.Inheritance;

public abstract class Animal implements Comparable<Animal> {
    // cannot do new Animal with an abstract class

	private String name, breed;
	private int age;
	private boolean hasEaten, hasSlept, hasPlayed;
	
    
    public Animal (String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }


    public String getName() {
		return this.name;

    }

    public String getBreed() {
		return this.breed;

    }

    public int getAge() {
		return this.age;

    }

    public void sleep() {
        this.hasSlept = true;
    }

    public void eat() {
        this.hasEaten = true;
    }

    public void play() {
        this.hasPlayed = true;
    }

    public boolean hasSlept() {
        return this.hasSlept;
    }
    
    public boolean hasEaten() {
        return this.hasEaten;
    }

    public boolean hasPlayed() {
        return this.hasPlayed;
    }

    public boolean isHappy() {
        return false;
    }


    public String toString() {
        return this.name + ", " + this.breed + ", " + this.age;
    }

    public abstract String speak(); // declared but not implemented

    // -1 0 1
    public int compareTo (Animal animal) {
        // 
    }

}