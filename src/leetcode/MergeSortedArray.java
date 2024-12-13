package leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    private static void sortMergedArray(int[] arr1, int[] arr2, int m, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && arr1[p1] > arr2[p2]) {
                arr1[i--] = arr1[p1--];
            } else {
                arr1[i--] = arr2[p2--];
            }
        }
    }

    private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] mergedArray = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
//        int m = 3, n = 3;
        //sortMergedArray(arr1, arr2, m, n);
        //System.out.println(Arrays.toString(arr1));
        int[] result = mergeSortedArrays(arr1, arr2);
        System.out.println(Arrays.toString(result));

    }
}