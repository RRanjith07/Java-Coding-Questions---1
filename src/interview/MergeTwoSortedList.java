package interview;

import java.util.Arrays;

public class MergeTwoSortedList {
    private static int[] mergeTwoSortedList(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        int p1 = arr1.length - 1;
        int p2 = arr2.length - 1;
        int i = res.length - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (arr1[p1] > arr2[p2]) {
                res[i--] = arr1[p1--];
            } else {
                res[i--] = arr2[p2--];
            }
        }
        while (p1 >= 0) {
            res[i--] = arr1[p1--];
        }
        while (p2 >= 0) {
            res[i--] = arr2[p2--];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};
        int[] res = mergeTwoSortedList(arr1, arr2);
        System.out.println(Arrays.toString(res));
    }
}
