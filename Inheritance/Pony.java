package Exercises.Inheritance;

public class Pony extends Animal{
    
    private boolean hasBeenGroomed = false;

    public Pony(String name, String breed, int age, boolean alreadyGroomed) {
        super(name, breed, age);

        this.hasBeenGroomed = alreadyGroomed;
    }

    public void groom() {
        this.hasBeenGroomed = true;
    }

    public boolean hasBeenGroomed() {
        return this.hasBeenGroomed;
    }

    public boolean isHappy() {
        return hasSlept() && hasPlayed() && hasEaten() && hasBeenGroomed();
    }
}
