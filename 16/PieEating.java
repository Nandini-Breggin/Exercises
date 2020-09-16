import java.util.Scanner;
import java.lang.Math;

/*
At the State Fair Pie Eating Contest all contestants in the
heavyweight division must weigh within 30 pounds of 250 pounds.
Write a program that asks for a contestant's
weight and then says if the contestant is allowed in the contest.
**/

public class PieEating {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your weight: ");
        double weight = input.nextDouble();


        if (weight >= 30 && weight <= 250) {
            System.out.println("You can enter the contest!");
        } else {
            System.out.println("You cannot enter the contest. Try next year!");
        }

        

    }


}
