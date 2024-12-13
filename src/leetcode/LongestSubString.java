package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    private static void longestSubString(String s) {
       int start =0;
       int end =0;
       int max = 0;
       Set<Character> set = new HashSet<>();

       while(end<s.length()){
           if (!set.contains(s.charAt(end))){
               set.add(s.charAt(end));
               end++;
               max = Math.max(max,set.size());
           }
           else{
               set.remove(s.charAt(start));
               start++;
           }
       }
        System.out.println(max);
    }

    public static void main(String[] args) {
        longestSubString("abcdabcbb");
    }
}
