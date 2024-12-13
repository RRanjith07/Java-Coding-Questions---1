package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SubArrayWithGivenSum {
    private static List<Integer> subArrayGivenSum(int[] arr, int target) {
        int currentSum = 0;
        int start = 0;
        List<Integer> list = new ArrayList<>();
        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }
            if (currentSum == target) {
                for (int i = start; i <= end; i++) {
                    list.add(arr[i]);
                }
                return list;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int targetSum = 33;

        List<Integer> subarray = subArrayGivenSum(arr, targetSum);
        if (!subarray.isEmpty()) {
            System.out.println("Subarray with the given sum " + targetSum + ": " + subarray);
        } else {
            System.out.println("No subarray with the given sum found.");
        }

    }
}
