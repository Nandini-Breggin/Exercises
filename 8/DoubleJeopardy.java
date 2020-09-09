public class DoubleJeopardy
{
  public static void main (String[] args) {
    double value = 1.7E309;
    // IT IS BROKEN RIGHT NOW... THAT IS WHAT THE CHAPTER WANTED!!!!!!!!
    // - 1.7E308 to + 1.7E308 is the largest value it can take...
    // anything smaller or larger than that is too big to be a float or double float
    System.out.println("A double: " +  value);
  }
}