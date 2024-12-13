package practice;

public class ExtractDigit {
    public static void extractDigit(String str)
    {
        String digits = "";
        String nonDigits = "";
        for (int i=0;i<str.length();i++)
        {
            if (Character.isDigit(str.charAt(i)))
            {
                digits = digits+str.charAt(i);
            }
            else {
                nonDigits = nonDigits+str.charAt(i);

            }
        }
        System.out.println("Digits: "+digits);
        System.out.println("Non Digits: "+nonDigits);
    }

    public static void main(String[] args) {
        extractDigit("Ranjith1997");
    }
}
