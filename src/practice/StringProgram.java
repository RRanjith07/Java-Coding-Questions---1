package practice;

import java.util.HashMap;

public class StringProgram {
    private static void occurence(String str){
        // Alice is girl and Bob is boy
        String[] words = str.split(" ");
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        for (String word : words)
        {
            if (map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }
            else {
                map.put(word,1);
            }
        }
        System.out.println(map);
    }
    private static void reverseSentence(String sentence){
        // "India is Country My"
        String[] words = sentence.split(" ");
        String result = "";
        for (int i=words.length-1;i>=0;i--){
            result = result + words[i]+" ";
        }
        System.out.println(result.trim());
    }
    private static void reverseEachWord(String sentence){
        String[] words = sentence.split(" ");
        String result = "";
        for (String word : words){
            for (int i =word.length()-1;i>=0;i--){
                result = result + word.charAt(i);
            }
            result = result+" ";
        }
        System.out.println(result.trim());
    }
    public static void main(String[] args) {
        //occurence("Alice is girl and Bob is boy");
        reverseEachWord("India is Country My");
    }
}