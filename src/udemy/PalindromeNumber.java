package udemy;

public class PalindromeNumber {
    private static boolean isPalindrome(int number) {
        if (number < 0) {
            System.out.println("Not a Palindrome");
            return false;
        }
        int actualNumber = number;
        int rev = 0;
        boolean isPalindrome = false;
        while (actualNumber != 0) {
            rev = rev * 10 + actualNumber % 10;
            actualNumber = actualNumber / 10;
        }
        if (number == rev) {
            System.out.println("Palindrome");
            isPalindrome = true;
            return isPalindrome;
        }
        System.out.println("Not a Plaindrome");
        return false;
    }

    private static int reverseInteger(int number) {
        int actualNumber = number;
        int revNumber = 0;

        while (actualNumber != 0) {
            int pop = actualNumber % 10;
            actualNumber = actualNumber / 10;

            if (revNumber > Integer.MAX_VALUE / 10 || (revNumber == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (revNumber < Integer.MIN_VALUE / 10 || (revNumber == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            revNumber = revNumber * 10 + pop;
        }
        return revNumber;
    }

    public static void main(String[] args) {
//        System.out.println(isPalindrome(-121));
        System.out.println(reverseInteger(1534236469));
    }
}