public class StringDemo2
{
  public static void main ( String[] args )
  {
    String str;
    int len;

    str = new String( "     Elementary, my dear Watson!                    !");
    
    // Spaces count as characters
    // Tabs are one character

    len = str.length();

    System.out.println("The length is: " + len );

  }
}