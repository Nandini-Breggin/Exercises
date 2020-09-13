public class StringDemo3
{
  public static void main ( String[] args )
  {
    String str = new String( "Golf is a good walk spoiled." ); // create the original object

    String sub = str.substring(0, 28); //create a new object from the original

    System.out.println( sub ); //Removes the characters of the number, keeps the number between the parameters, and the deletes the rest of the characters after the second parameter number 

  }
}

// 1. Nothing shows up
