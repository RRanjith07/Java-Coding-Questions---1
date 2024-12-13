package leetcode;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrences {
    private static void countOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (!map.containsKey(j)) {
                map.put(j, 1);
            } else {
                map.put(j, map.get(j) + 1);
            }
        }
        System.out.println("Repeating more than once");
        for (Map.Entry<Integer, Integer> entries : map.entrySet()) {
//            System.out.println(entries.getKey() + " : " + entries.getValue());

            if (entries.getValue() >= 2) {
                System.out.println(entries.getKey() + " : " + entries.getValue());
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 8, 7, 3, 1, 2, 7};
        countOccurrences(arr);

    }
}
