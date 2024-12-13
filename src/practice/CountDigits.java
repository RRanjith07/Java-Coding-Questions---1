package practice;

public class CountDigits {

    private static int countDigit(long number){
        Math.abs(number);
        int count =0;
        while (number !=0){
            number = number/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countDigit(1));
    }
}
