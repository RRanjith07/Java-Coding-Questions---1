package practice;

public class ArmStrongNumbers {
    public static void isArmStrong(int number)
    {
        int temp = number;
        int reminder;
        double cube = 0;

        while (temp>0)//153
        {
            reminder = temp%10;
            cube = cube+reminder*reminder*reminder;
            temp = temp/10;

        }
        if (number==cube)
        {
            System.out.println(number+" is a ArmStrong Number");
        }
        else {
            return;
        }
    }

    private static void armStrong(int number){

        int armStrongNumber = 0;
        int temp = number;

        while (temp!=0){
            int digit = temp%10;
            armStrongNumber = armStrongNumber+digit*digit*digit;
            temp = temp/10;
        }
        if (number ==armStrongNumber){
            System.out.println(number+" is armStrong Number");
        }
//        else {
//            System.out.println(number+" is not an armStrong Number");
//        }
    }
    public static void main(String[] args) {
        isArmStrong(357);
        for(int i=0;i<500;i++) {
            armStrong(i);
        }
    }
    //153 370 371 407
    //153 ->27+125+1 = 153

}
