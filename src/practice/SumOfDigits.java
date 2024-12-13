package practice;

public class SumOfDigits  {
    private static void sumOfDigits(int number){
        int sum = 0;
        int temp = number;
        while (temp!=0){
            sum = sum+ temp%10;
            temp = temp/10;
        }
        System.out.println("The sum of the "+number+"is: "+sum);

    }
    public static void main(String[] args) {
        sumOfDigits(987);


    }
}
