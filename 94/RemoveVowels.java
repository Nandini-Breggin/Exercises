public class RemoveVowels {
    
    public static void main (String[] args) {
        System.out.println(removeVowel("elehippothumpapotaus")); // lhppthmppts
        System.out.println(removeVowel("bsktbll")); // bsktbll
        System.out.println(removeVowel("testing")); // tstng
        System.out.println(removeVowel("APCSA")); // PCS
    }

    public static boolean isAVowel(String letter) {

        if (letter.length() !=1) {
            return false;
        }

        return letter.toLowerCase().matches("[aeiou]");
    }

    public static String removeVowel(String s) {
        if (s.length() == 0) {
            return s;
        }

        String a = s.substring(0,1);

        return isAVowel(a) ? removeVowel(s.substring(1)) : a + removeVowel(s.substring(1));
    }


} 
