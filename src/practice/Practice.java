package practice;

import java.util.HashMap;
import java.util.Map;

public class Practice {
    private static void isPrime(int number) {
        boolean isPrime = true;
        if (number <= 1)
            isPrime = false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }

    private static void printPrime(int n) {
        if (n <= 1) {
            System.out.println("No Prime Numbers are available...");
            return;
        }
        for (int i = 2; i <= n; i++) {
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

    private static void fib(int number) {
        int t1 = 0;
        int t2 = 1;
        for (int i = 0; i <= number; i++) {
            System.out.println(t1);
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }

    private static void firstCharFromString(String str) {
        String result = "";
        //Sachin Ramesh Tendulkar  --> S R Tendulkar
        String[] words = str.split(" ");
        for (int i = 0; i < words.length - 1; i++) {
            result = result + words[i].charAt(0) + " ";
        }
        result = result + words[words.length - 1].trim();
        System.out.println(result);
    }

    private static void reverseEachWord(String str) {
        String words[] = str.split(" ");
        String result = "";
        for (String word : words) {
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord = reversedWord + word.charAt(i);
            }
            result = result + reversedWord + " ";
        }
        System.out.println(result.trim());
    }

    private static void mergeSortedArray(int[] arr, int[] arr2, int m, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (arr[p1] > arr2[p2]) {
                arr[i--] = arr[p1--];
            } else {
                arr[i--] = arr2[p2--];
            }
        }
    }

    private static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int reqNumber = target - arr[i];
            if (map.containsKey(reqNumber)) {
                return new int[]{map.get(reqNumber), i};

            } else {
                map.put(arr[i], i);
            }
        }
        return new int[]{};
    }

    private static int maxSum(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], arr[i] + currentSum);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    private static void moveZerosToLeft(int[] arr) {
        int writeIndex = arr.length - 1;
        for (int readIndex = arr.length - 1; readIndex >= 0; readIndex--) {
            if (arr[readIndex] != 0) {
                arr[writeIndex] = arr[readIndex];
                writeIndex--;
            }
        }
        while (writeIndex >= 0) {
            arr[writeIndex] = 0;
            writeIndex--;
        }
    }

    private static void moveZerosToRight(int[] arr) {
        int writeIndex = 0;
        for (int readIndex = 0; readIndex < arr.length; readIndex++) {
            if (arr[readIndex] != 0) {
                arr[writeIndex] = arr[readIndex];
                writeIndex++;
            }
        }
        while (writeIndex < arr.length) {
            arr[writeIndex] = 0;
            writeIndex++;
        }
    }

    //Move all the negative numbers present in integer array to start.
    private static void moveNegativeNumbers(int[] arr) {
        //[1,2,-1,-2]==> [-1,-2,1,2]
        int negativeNumberIndex = 0;
        for (int currentIndex = 0; currentIndex < arr.length; currentIndex++) {
            if (arr[currentIndex] < 0) {
                //swap;
                int temp = arr[negativeNumberIndex];
                arr[negativeNumberIndex] = arr[currentIndex];
                arr[currentIndex] = temp;
                negativeNumberIndex++;
            }
        }
    }

    private static int fact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;

        }
        return fact;
    }

    private static void printPrimeNumber(int num) {
        if (num < 0 || num == 1) {
            System.out.println("Not a prime number");
            return;
        }
        for (int i = 2; i <= num; i++) {
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

    private static void checkPrime(int number) {
        if (number < 2) {
            System.out.println(number + " is Not a Prime number");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is Prime number");
        } else {
            System.out.println(number + " is Not a Prime number");
        }
    }

    public static void main(String[] args) {
//        printPrimeNumber(100);
        checkPrime(13);

//        System.out.println(fact(5));
//        int[] arr = {1, 2, 3, 4, -1, -2};
//        moveNegativeNumbers(arr);
//        System.out.println(Arrays.toString(arr));
//        isPrime(11);
//        printPrime(15);
//        fib(10);
//        firstCharFromString("Sachin");
//        reverseEachWord("Ranjith Raghurama Poojary");

//        int arr1[] = {1, 5, 8, 0, 0, 0};
//        int arr2[] = {1, 5, 7};
//        int m = 3, n = 3;
//        mergeSortedArray(arr1, arr2, m, n);
//        System.out.println(Arrays.toString(arr1));

//        int[] arr = {2, 5, 5, 9};
//        int target = 11;
//        int[] result = twoSum(arr, target);
//
//        if (result.length == 0) {
//            System.out.println("No two numbers sum up to the target.");
//        } else {
//            System.out.println("Indices: " + Arrays.toString(result));
//        }
//        int arr[] = {1, 3, -3, 4};
//        System.out.println(maxSum(arr));

//        int arr[] = {0, 1, 3, 0, 0, 0, 5};
//        moveZerosToRight(arr);
//        System.out.println(Arrays.toString(arr));

    }

}
