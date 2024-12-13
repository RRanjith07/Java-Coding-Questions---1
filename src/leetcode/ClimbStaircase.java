package leetcode;

public class ClimbStaircase {
    private static int climbStairCase(int n) {
        if (n <= 1)
            return 1;
        int p1 = 1;
        int p2 = 1;
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = p1 + p2;
            p2 = p1;
            p1 = current;
        }
        return current;
    }

    private static void fib(int n) {
        int t1 = 0;
        int t2 = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t2 = t1;
            t1 = sum;
        }
    }

    private static void printPrime(int num) {
        if (num < 2) {
            System.out.println("There is no prime numbers available");
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

    private static boolean isPrime(int num) {
        if (num < 2) {
            System.out.println(num + " is not a prime number");
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //System.out.println(climbStairCase(2)

        if (isPrime(11)) {
            System.out.println("The given number is prime");
        } else {
            System.out.println("Given number is not a prime number");
        }
    }
}