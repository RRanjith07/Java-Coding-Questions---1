package interview;

import java.util.Arrays;

public class MaximumDifference {
    private static int[] maxDiff(int[] arr) {
        // {6,1,3,7,8,4,1};
        int maxDiff = 0;
        int minIndex = 0;
        int[] result = new int[2];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[minIndex] > maxDiff) {
                maxDiff = arr[i] - arr[minIndex];
                result[0] = minIndex;
                result[1] = i;
            }
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("Difference: " + maxDiff);
        return result;

    }

    public static void main(String[] args) {
        int[] arr = {6, 1, 3, 7, 8, 4, 1};
        System.out.println(Arrays.toString(maxDiff(arr)));
    }
}
