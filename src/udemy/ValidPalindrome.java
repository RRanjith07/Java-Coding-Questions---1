package udemy;

public class ValidPalindrome {
    private static boolean validPalindrome(String str) {
        String s = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String output = "";
        boolean isPalindrome = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            output = output + s.charAt(i);
        }
        if (s.equals(output)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        String s = " ";
        System.out.println(validPalindrome(s));
    }
}
