public class PayrollProgram
{  

    static long hoursWorked;   
    static double payRate;
    static double taxRate;

  public static void main ( String[] args ) {
    hoursWorked;    // = 40.0
    payRate = 10.0;
    taxRate = 0.10;

    System.out.println("Hours Worked: " + hoursWorked );
    System.out.println("Pay Amount  : " + (hoursWorked * payRate) );
    System.out.println("Tax Amount  : " + (hoursWorked * payRate * taxRate) );
  }
}

// gets a value of zero for all if it is taken away
// not a statement when there is no value
