package practice;

public class CountStringAndNumber {
    private static void countStringAndNumber(String[] strArr){
        int strCount = 0;
        String strRes = "";
        String strDigit = "";
        int digit = 0;
        for (String s : strArr){
            if (s.matches("\\d+")){
                strDigit = strDigit+s+" ";
                digit++;
            }
            else {
                strRes = strRes+s+" ";
                strCount++;
            }
        }
        System.out.println("Strings: "+strRes+" Count: "+strCount);
        System.out.println("Digits: "+strDigit+" Count: "+digit);
    }
    public static void main(String[] args) {
        String[] str = {"abcd","Pune","623","Mumbai","10"};
        countStringAndNumber(str);
    }
}