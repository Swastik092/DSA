import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
        if (ana(s1, s2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
    }
    static boolean ana(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }
}
