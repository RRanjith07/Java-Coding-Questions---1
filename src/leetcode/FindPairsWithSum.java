package leetcode;

import java.util.*;

public class FindPairsWithSum {
    private static void findPairs(int[] arr, int targetSum) {
        Set<Integer> set = new HashSet<>();
        boolean isFound = false;
        for (int number : arr) {
            int requiredNumber = targetSum - number;
            if (set.contains(requiredNumber)) {
                System.out.println("{" + requiredNumber + "," + number + "}");
                isFound = true;
            }
            set.add(number);
        }
        if (!isFound) {
            System.out.println("Pairs not found for the given sum " + targetSum);
        }
    }

    private static int[] twoSum(int[] arr, int targetSum) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int requiredNumber = targetSum - arr[i];
            if (map.containsKey(requiredNumber)) {
                return new int[]{map.get(requiredNumber), i};

            } else {
                map.put(arr[i], i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 7;
        findPairs(arr,sum);
//        int[] result = twoSum(arr, sum);
//        if (result.length == 0) {
//            System.out.println("No pairs are found for the given sum " + sum);
//        } else {
//            System.out.println("Indices: " + Arrays.toString(result));
//        }
    }
}
