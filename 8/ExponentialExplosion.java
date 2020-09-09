public class ExponentialExplosion
{
  public static void main (String[] args) {
    double value = 1.7E309;
    // This code is broken... that is what the chapter wanted!!!
    System.out.println("e to the power value: " +  Math.exp( value ) );
  }
}