package practice;

public class PrimeNumber {
    private static boolean isCheckPrime(int number){
        if(number<=1){
            return false;
        }
        for (int i =2;i<Math.sqrt(number);i++)
        {
            if(number%i==0) {
                return false;
            }
        }
        return true;
    }
    private static void printPrime(int n){
        if (n<=1)
            return;
        for (int i = 2;i<=n;i++){
            boolean isPrime = true;
            for (int j = 2;j<=Math.sqrt(i);j++){
                if (i%j ==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        int num = 31;
        printPrime(15);
//        isCheckPrime(num);
//        if(isCheckPrime(num)){
//            System.out.println(num+" is prime number");
//        }
//        else {
//            System.out.println(num+" is not a prime number");
//        }
    }
}
