package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    private static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int requiredNum = target - arr[i];
            if (map.containsKey(requiredNum)) {
                return new int[]{map.get(requiredNum), i};
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[]{};
    }

    private static int maxSum(int[] arr){
        int max = 0;
        int currentMax = 0;
        for (int i =0;i<arr.length;i++){
            currentMax = Math.max(arr[i],currentMax+arr[i]);
            max = Math.max(max,currentMax);
        }
        return max;
    }

    

    public static void main(String[] args) {
        int[] arr = {2, 7, -11, 15};
        System.out.println(maxSum(arr));
        int target = 18;
        int[] result = twoSum(arr, target);
        if (result.length != 0) {
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("No Indicies found");
        }
    }
}
