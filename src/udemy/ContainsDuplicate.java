package udemy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    private static boolean containsDuplicate(int[] arr) {
        Arrays.sort(arr);
        //[1,1,2,3,4,4,5]
        boolean isDuplicateFound = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("duplicate found " + arr[i]);
                isDuplicateFound = true;
            } else {
                System.out.println("duplicate not found");
            }
        }
        return isDuplicateFound;
    }

    private static boolean containsDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int number : arr) {
            if (set.contains(number)) {
                System.out.println("Duplicate found: " + number);
                return true;
            }
            set.add(number);
        }
        System.out.println("No Duplicates found...");
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4};
        containsDuplicates(arr);
    }
}
