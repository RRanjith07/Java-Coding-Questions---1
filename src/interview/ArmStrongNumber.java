package interview;

public class ArmStrongNumber {
    private static void checkArmStrongNumber(int number) {
        int originalNumber = number;
        double sum = 0;

        while (originalNumber != 0) {
            double base = originalNumber % 10;
            sum = sum + Math.pow(base, 3);
            originalNumber = originalNumber / 10;
        }
        if (number == sum) {
            System.out.println("given number: " + number + " is armstrong number");
        } else {
            System.out.println("given number: " + number + " is not an armstrong number");
        }
    }

    public static void main(String[] args) {
        checkArmStrongNumber(22);
    }
}
