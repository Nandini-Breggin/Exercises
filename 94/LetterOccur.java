public class LetterOccur {

    public static void main (String[] args) {
        System.out.println(characterCount("XaaaYaaaZaaaYaaaaY", "Y")); // 3
        System.out.println(characterCount("HELLO", "H")); // 1
        System.out.println(characterCount("Koalalalalalalala", "L")); // 0
        System.out.println(characterCount("Koalalalalalalala", "l")); // 7
    }

    public static int characterCount(String s, String i) {
        if (s.length() <= 0) {
            return 0;
        }

        if (s.substring(0,1). equals(i)) {
            return 1 + characterCount(s.substring(1), i);
        }

        return characterCount(s.substring(1), i);
    }
}
