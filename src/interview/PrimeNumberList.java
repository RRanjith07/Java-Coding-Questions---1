package interview;

import java.util.List;

public class PrimeNumberList {
    private static void primeNumberList(List<Integer> numList) {
        for (int i = 0; i < numList.size(); i++) {
            int number = numList.get(i);
            boolean isPrime = true;
            if (number < 2) {
                isPrime = false;

            }
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number);
            }
        }
    }

    private static void primeNumbers(int number) {
        if (number < 2) {
            System.err.println("Please provide valid number");
            return;
        }
        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
//        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 7, 9, 11, 13, 17);
//        primeNumberList(numList);
        primeNumbers(2);
    }
}
