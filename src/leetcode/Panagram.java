package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class Panagram {
    public static void isAnagram(String sentence1, String sentence2) {
        String s1 = sentence1.toLowerCase();
        String s2 = sentence2.toLowerCase();
        if (s1.length() != s2.length()) {
            System.out.println("Length Mismatch");
            return;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        if (Arrays.equals(c1, c2)) {
            System.out.println("Given Strings are Anagram");
        } else {
            System.out.println("Given Strings are Not Anagram");
        }
    }

    public static void isPanagram(String sentence) {
        sentence = sentence.toLowerCase();
        HashSet<Character> set = new HashSet<Character>();
        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                set.add(c);
            }
        }
        if (set.size() == 26) {
            System.out.println("Given String " + sentence + " is Panagram");
        } else {
            System.out.println("Given String " + sentence + " is not Panagram");
        }
    }

    public static void main(String[] args) {
        // isAnagram("DEAT","EDAR");
        isPanagram("The quick brown fox jumps over the lazy dog");
        isPanagram("Hello World");
    }
}