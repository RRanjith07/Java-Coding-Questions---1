package practice;

public class ReverseEachWordInString {
    public static void ReverseWord(String str)//"I Love Java"
    {
        String[] words = str.split(" ");
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
    }
    public static void main (String[]args){
        ReverseWord("I Love Java");

    }
}
