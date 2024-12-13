package practice;

import java.util.HashMap;
import java.util.Map;

public class WordCountMap {
    private static void getWordCount(String str) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i=0;i<str.length();i++)
        {
            if (!map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),1);
            }
            else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        getWordCount("RanjithR");//{a=1, R=2, t=1, h=1, i=1, j=1, n=1}
    }
}
