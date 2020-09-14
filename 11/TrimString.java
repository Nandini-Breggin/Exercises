public class TrimString
{
  public static void main ( String[] args )
  {
    
    String first = new String("    In a Hole          in the ground there lived a Hobbit.   .");
    
    System.out.println(first);

    String second;

    second = first.trim();

    System.out.println(second);
    

    // .trim() only takes out the first set of spaces before the first letter in the "",
    // internal spaces within "" remain.

  }
}