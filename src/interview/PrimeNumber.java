package interview;

public class PrimeNumber {
    private static boolean isPrime(int number) {
        if (number >= 0 && number <= 2) {
            System.out.println(number + " is not a Prime Number");
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(number + " is not a Prime Number");
                return false;
            }
        }
        System.out.println(number + " is Prime Number");
        return true;
    }

    private static void primeNumberRange(int number) {
        if (number < 2) {
            System.out.println("Please pass valid number");
            return;
        }
        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " ");
            }
        }
    }

    private static void reverseEachWord(String str) {
        //This is Ranjith

        String[] words = str.split(" ");
        String result = "";
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                result = result + word.charAt(i);
            }
            result = result + " ";
        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        String str = "This is Ranjith";
        reverseEachWord(str);
    }
}
