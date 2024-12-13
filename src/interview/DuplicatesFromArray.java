package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesFromArray {

    private static void duplicateFromArray(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                duplicate.add(num);
            }
            set.add(num);
        }
        if (duplicate.size() == 0) {
            System.out.println("There are no duplicates");
        } else {
            System.out.println("Duplicates found: " + duplicate);
        }
    }

    private static void uniqueElement(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> uniqueSet = new HashSet<>();
        for (int number : arr) {
            if (!set.add(number)) {
                uniqueSet.remove(number);
            } else {
                uniqueSet.add(number);
            }
        }
        if (uniqueSet.isEmpty()) {
            System.out.println("No Unique Elements");
        } else {
            System.out.println("Unique Elements are: " + uniqueSet);
        }
    }

    private static void uniqueElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("Unique Elements are: " + arr[i]);
            }
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (i!=j && arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 4, 5, 5};
//        duplicateFromArray(arr);
        int[] arr = {3, 5, 6, 7, 1, 2, 2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
//        uniqueElements(arr);
    }
}
