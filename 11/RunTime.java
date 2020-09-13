public class RunTime {
    

    public static void main(String[] args) {

        String str ;

        str = new String("Hello, World!");

        System.out.println(str);

        String secondVariable;

        System.out.println(secondVariable);

        // error: variable secondVariable might not have been initialized
        // I created the reference variable, but I didn't create secondVariable as a new String

    }
}