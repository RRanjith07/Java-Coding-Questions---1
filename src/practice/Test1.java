package practice;

public class Test1 {

    private static void palindrome(int number)
    {
        int actualNumber = number;
        int revNumber = 0;
        while(actualNumber !=0)
        {
            int digit = actualNumber%10;
            revNumber = revNumber*10+digit;
            actualNumber = actualNumber/10;
        }
        if (number == revNumber)
        {
            System.out.println("given Number: "+number+" is Pallindrome");
        }
        else{
            System.out.println("given Number: "+number+" is not a Pallindrome");
        }
    }

    public static void main(String[] args) {
        palindrome(1221);
    }
}
