import java.util.Scanner;
import java.lang.Math;

public class Age {
    public static void main (String []args ){
        Scanner input = new Scanner(System.in);

        long lifetime = 2500000000L;

        System.out.print("Year: ");
        int year = input.nextInt();
        System.out.print("Months: ");
        int months = input.nextInt();
        System.out.print("Days: ");
        int days = input.nextInt();
        int total_y = 0;
        int total_m = 0;
        int total_d = 0;

        total_y = year * 365 * 24 * 60 * 60; 
        total_d = days * 24 * 60 * 60;

        for(int i = 0; i < months; i++){
            if((i+1)%2 == 0 && (i+1) != 2){
                total_m += 31;
            } else if ((i+1) == 2) {
                total_m += 29;
            } else {
                total_m += 30;
            }
        }

        int total = total_m + total_y + total_d;

        double percent = (double)total / lifetime;


        System.out.print("Your age in second: " + total);
        System.out.println("");    
        System.out.print("The percent you have lived of your life: " + percent + "%");     
        System.out.println("");

    }
}