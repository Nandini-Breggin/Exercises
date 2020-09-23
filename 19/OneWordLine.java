import java.util.Scanner;

public class OneWordLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the word: ");
        String word = input.nextLine();
 

        int i = 0;

        while(i < word.length()) {
            System.out.println(word.charAt(i));
            i++;
        }


    }

}