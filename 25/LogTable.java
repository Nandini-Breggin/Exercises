import java.util.Scanner;

public class LogTable {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print( "<html>\n<body>\n<table>" );
        System.out.print( "<tr><th>x</th><th>ln(x)</th></tr>" );
        
        System.out.print("What is the highest number you want to calculate the log of? ");
        int num = input.nextInt();

		for (int i = 0; i <= num; i++) {

            double n = (double)i / 10;
            
			System.out.println("<tr><td>" + n + "</td><td>" + Math.log(n) + "</td></tr>");

		}

		 System.out.println("</table>\n</body>\n</html>");

	}

}