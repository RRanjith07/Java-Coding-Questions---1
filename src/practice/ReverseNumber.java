package practice;

public class ReverseNumber {
    private static void reverseNumber(int number)//143
    {
        int reverseNumber = 0;
        int originalNumber = number;
        while (originalNumber!=0)
        {
            int digit = number%10;
            reverseNumber = reverseNumber*10+digit;
            originalNumber = originalNumber/10;
        }
        if(originalNumber==reverseNumber)
        {
            System.out.println("The given number: "+number+" is Palindrome");
        }
        else {
            System.out.println("The given number: "+number+" is not a Palindrome");
        }
        System.out.println(reverseNumber);

    }
    public static void main(String[] args) {
        reverseNumber(122);


    }
}