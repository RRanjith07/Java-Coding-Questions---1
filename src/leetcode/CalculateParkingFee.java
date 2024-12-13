package leetcode;

public class CalculateParkingFee {
    private static int calculateParkingFee(int hours, int minutes) {
        int totalMinutes = (hours * 60) + minutes;
        int fee = 0;
        if (totalMinutes <= 15)
            fee = 0;
        else if (totalMinutes > 15 && totalMinutes <= 120) {
            fee = 5;
        } else if (totalMinutes > 120 && totalMinutes <= 300) {
            fee = 10;
        } else {
            fee = 10 + ((totalMinutes - 300) / 60);
        }
        return fee;
    }

    public static void main(String[] args) {
        //  System.out.println(calculateParkingFee(6, 0));

        int a = 0;
        int b = a;
        b = a++;
        System.out.println(a);
        System.out.println(b);

    }
}
