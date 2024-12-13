package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    private static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int requireNum = target - arr[i];
            if (map.containsKey(requireNum)) {
                return new int[]{map.get(requireNum), i};

            } else {
                map.put(arr[i], i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 9};
        int target = 10;
        int[] result = twoSum(arr, target);

        if (result.length == 0) {
            System.out.println("No two numbers sum up to the target.");
        } else {
            System.out.println("Indices: " + Arrays.toString(result));
        }
    }
}
