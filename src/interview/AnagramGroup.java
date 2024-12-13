package interview;

import java.util.*;

public class AnagramGroup {
    private static boolean isAnagram(String str1, String str2) {
        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);
        return Arrays.equals(s1Arr, s2Arr);
    }

    private static ArrayList<List<String>> anagramGroup(String[] strArray) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strArray) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sorted = new String(charArr);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
    }

    private static ArrayList<List<String>> anagram(String[] strArray) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strArray) {
            char[] charArray = str.toLowerCase().toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat", "Tab"};
        System.out.println(anagram(strs));
    }
}
