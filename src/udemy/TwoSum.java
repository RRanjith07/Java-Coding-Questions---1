package udemy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    private static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int requiredNumber = target - arr[i];
            if (map.containsKey(requiredNumber)) {
                return new int[]{requiredNumber, arr[i]};
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 18;
        int[] answer = twoSum(arr, target);
        System.out.println(target + "---" + Arrays.toString(answer));
    }
}
