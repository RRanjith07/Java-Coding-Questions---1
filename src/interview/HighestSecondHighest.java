package interview;

public class HighestSecondHighest {

    private static void highestAndSecondHighest(int[] arr) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            } else if (arr[i] > secondHighest && arr[i] < highest) {
                secondHighest = arr[i];
            }
        }
        System.out.println("Highest: " + highest);
        System.out.println("Second Highest: " + secondHighest);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 8, 8};
        highestAndSecondHighest(arr);
    }
}
