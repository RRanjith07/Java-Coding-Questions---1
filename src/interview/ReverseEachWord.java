package interview;

public class ReverseEachWord {
    private static String reverseEachWord(String str) {
        String[] words = str.split(" ");

        String result = "";
        for (String word : words) {
            String reversedWords = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWords = reversedWords + word.charAt(i);
            }
            result = result + reversedWords+" ";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord("I am a Software Tester"));

    }
}
