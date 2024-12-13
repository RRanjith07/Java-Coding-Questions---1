package interview;

import java.util.Arrays;

public class MergeTwoSortedArray {
    private static int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int p1 = 0;
        int p2 = 0;
        int[] resultArray = new int[arr1.length + arr2.length];
        int i = 0;

        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] < arr2[p2]) {
                resultArray[i++] = arr1[p1++];
            } else {
                resultArray[i++] = arr2[p2++];
            }
        }
        while (p1<arr1.length){
            resultArray[i++] = arr1[p1++];
        }
        while (p2<arr2.length){
            resultArray[i++] = arr2[p2++];
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] result = mergeSortedArray(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}
