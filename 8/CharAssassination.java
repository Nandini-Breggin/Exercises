public class CharAssassination
{
  public static void main (String[] args) {
    char ch = "A" ;
    System.out.println("A char: " +  ch );
  }
}



/** 
Change the 'A' into 'Z' and compile and run.
-> Works perfectly
Change the 'A' into 'AA' and try to compile the program.
-> Doesn't work
    error: unclosed character literal 
    error: not a statement
Change the 'A' into ' ' and compile and run the program. (Notice carefully: there is a single space between the two ' marks.)
-> Works perfectly
Change the 'A' into '' and try to compile. (Notice carefully: there is no character between the two ' marks.)
-> Doesn't work
    error: empty character literal
Change the 'A' into "A" and try to compile the program.
(The double quotes " signify a String, which is something different from a char).
-> Doesn't work
    error: incompatible types: String cannot be converted to char
*/