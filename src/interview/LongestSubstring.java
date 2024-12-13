package interview;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    private static int longestSubstring(String str) {
        int start = 0;
        int end = 0;
        int maxSum = 0;
        Set<Character> set = new HashSet<>();
        for (int currentIndex = 0; currentIndex <= str.length(); currentIndex++) {
            if (!set.contains(str.charAt(end))) {
                set.add(str.charAt(end));
                end++;
                maxSum = Math.max(maxSum, set.size());
            } else {
                set.remove(str.charAt(start));
                start++;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("pwwkew"));

    }
}
