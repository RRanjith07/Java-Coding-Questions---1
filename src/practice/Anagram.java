package practice;

import java.util.Arrays;

public class Anagram {
    private static void checkAnagram(String s1, String s2) {
        String str1 = s1.replaceAll("\\s", "");
        String str2 = s2.replaceAll("\\s", "");

        if (str1.length() != str2.length()) {
            return;
        } else {
            char[] c1 = str1.toLowerCase().toCharArray();
            char[] c2 = str2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if (Arrays.equals(c1, c2)) {
                System.out.println("Given Strings " + s1 + " and " + s2 + " are Anagram");
            } else {
                System.out.println("Given Strings " + s1 + " and " + s2 + " are Not a Anagram");
            }
        }
    }

    public static void main(String[] args) {
        checkAnagram("LISTEN", "SILENT");

    }
}
