import java.util.Scanner;

public class Internet {

	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );

        System.out.print( "Enter the item from the deli: " );
        String item = input.nextLine();
        
		System.out.print( "Enter the price of the item: " );
        double price = input.nextDouble();
        
		System.out.print( "Express delivery? (0 = no, 1 = yes): " );
        int delivery = input.nextInt();
        

        double total = 0;
        double delivery_price = 0;
        double delivery_cost = 0;
        
        double express = 0;
        
		if (price < 10) { 
			delivery_price = 2;
			express = 3.00;
        } else if (price >= 10) {
            delivery_price = 0;
            express = 3.00;
        }

        if (delivery == 1) {
			express = 3.00;
        } else {
            express = 0;
        }

        delivery_cost = express + delivery_price;

        total = price + delivery_cost;

        System.out.println( "Invoice:" );
        System.out.println("\t" + item + "\t\t $" + price);
		System.out.println( "\tDelivery cost:" + "\t $" + delivery_cost);
		System.out.println( "\tTotal:" + "\t\t $" + total );

    }
    

}