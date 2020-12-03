public class BoxTester {
   
    public static void main( String [] args ) {
        Box box = new Box(2.5, 5.0, 6.0); 

        System.out.println("Area: "  + box.area() + " volume: " + box.volume());
        
        Box biggerBox = box.biggerBox(box);

        System.out.println("Area: "  + biggerBox.area() + " volume: " + biggerBox.volume());

        Box smallerBox = box.smallerBox(box);

        System.out.println("Area: "  + smallerBox.area() + " volume: " + smallerBox.volume());

        System.out.println("Can the box nest into the big box?\t" + biggerBox.nests(smallerBox));
        System.out.println("Can the box nest into the small box?\t" + smallerBox.nests(biggerBox));


     }
 
 }