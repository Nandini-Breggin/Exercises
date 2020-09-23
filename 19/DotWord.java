import java.util.Scanner;

public class DotWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Word: ");
        String word_1 = input.nextLine();

        System.out.println("Enter Second Word: ");
        String word_2 = input.nextLine();
 

        System.out.print(word_1);

        while(word_1.length() + word_2.length() < 30) {
            System.out.print(".");
            word_1 += ".";
        }

        System.out.print(word_2 + "\n");

    }

}