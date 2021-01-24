public class Tester {
    public static void main(String[] args) {

        Class_2 example = new Class_2(3, 6, 9);
        Class_1 example2 = new Class_2(2, 4, 6);

        example.print();
        example2.print();

        example.set(2, 56, 6);
        example.print();

        example2.set(3, 5);
        example2.print();

    }

}