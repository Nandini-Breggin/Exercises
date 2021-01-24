//Client program for Person/Employee

import java.util.Scanner;

public class ClientEmployee {

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);

        String last, first, dept;

        double pay_rate;

        int hours;

        Employee prof = new Employee("John", "Doe", 25.50, 50, "APCSA"); //subclass alternate constructor invoked

        Employee newEmployee = new Employee(); //subclass default constructor invoked

        prof.print();
        prof.printLastFirst();


        newEmployee.setAll("Lulu", "Lemon", 21, 435.37, "Manager");
        newEmployee.print();
        newEmployee.printLastFirst();

        newEmployee.setAll("Nan", "Breg", 99999, 67, "Manager");
        newEmployee.print();
        newEmployee.printLastFirst();

        newEmployee.setAll("Test", "Ing", 999, 43, "APCSA");
        newEmployee.print();
        newEmployee.printLastFirst();

        System.out.println("\nAre prof and newEmployee equal?");
        System.out.println(newEmployee.equals(prof));

        newEmployee.copy(prof );

        System.out.println("\nAre prof and newEmployee equal after copying?");
        System.out.println(newEmployee.equals(prof));
    }

}