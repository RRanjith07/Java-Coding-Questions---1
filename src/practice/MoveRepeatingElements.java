package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MoveRepeatingElements {
    private static void moveRepeatingElementsToEnd(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int uniqueIndex = 0;
        for (int currentElement = 0; currentElement < arr.length; currentElement++) {
            if (!set.contains(arr[currentElement])) {
                set.add(arr[currentElement]);
                System.out.println(set + "Set Element");//[1,2,3,4,5]
                //swap
                int temp = arr[uniqueIndex];
                arr[uniqueIndex] = arr[currentElement];
                arr[currentElement] = temp;
                uniqueIndex++;
            }
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    private static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int uniqueIndex = 0;
        for (int currentElement = 0; currentElement < arr.length; currentElement++) {
            if (!set.contains(arr[currentElement])) {
                set.add(arr[currentElement]);
                arr[uniqueIndex] = arr[currentElement];
                uniqueIndex++;
            }
        }
        return Arrays.copyOf(arr, uniqueIndex);
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 1, 1, 2, 3};
        int[] result = removeDuplicates(arr);
        System.out.println(Arrays.toString(result));
    }
}
