public class Palindrome {
    
    public static void main (String[] args) {

        System.out.println("Are they palindromes?\n");

        System.out.println("hello:\t\t" + palindrome("hello")); // false
        System.out.println("racecar:\t" + palindrome("racecar")); // true
        System.out.println("tacocat:\t" + palindrome("tacocat")); // true
        System.out.println("LuluL:\t\t" + palindrome("LuluL")); // false
        System.out.println("Lulul:\t\t" + palindrome("Lulul")); // false
        System.out.println("Lulu:\t\t" + palindrome("Lulu")); // false
        System.out.println("LOLOL:\t\t" + palindrome("LOLOL")); // true
    }

    public static boolean palindrome(String s) {
        if (s.length() <= 1) return true;
        return s.charAt(0) == s.charAt(s.length()-1) && palindrome(s.substring(1, s.length()-1));
    }
}
