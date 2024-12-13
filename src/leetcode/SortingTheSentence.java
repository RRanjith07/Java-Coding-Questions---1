package leetcode;

import java.nio.charset.CharsetEncoder;

public class SortingTheSentence {
    private static void sortSentence(String input){
        String[] words = input.split(" ");
        String[] sortedWords = new String[words.length];

        for (String word: words){
            int index = Character.getNumericValue(word.charAt(0)-1);
            sortedWords[index] = word.substring(1,word.length());
        }
        String sortedSentence = String.join(" ", sortedWords);
        System.out.println(sortedSentence);
    }

    private static void getCharFromString(String str, char ch){
        int count =0;
        char ch1 = Character.toLowerCase(ch);
        String str1 = str.toLowerCase();
        for (int i=0;i<str.length();i++){
          if(str1.charAt(i) ==ch1){
              count++;
          }
          }
        if (count==0){
            System.out.println("The given charecter "+ch1+" is not present in the string "+str1);
      }else {
            System.out.println(ch1 + " is repeating " + count + " Time(s)");
        }

    }
    public static void main(String[] args) {
//        sortSentence("2is 1This 4name 3My");
        getCharFromString("Ranjith Raghurama Poojary", ' ');

    }
}
