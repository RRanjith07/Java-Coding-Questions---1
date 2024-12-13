package leetcode;

import java.util.Arrays;

public class ArraySquareSort {

    private static void arraySquare(int arr[])
    {
        for (int i=0;i<arr.length;i++){
            arr[i] = arr[i]*arr[i];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {-6,-7,-8,1,2,-9};
        arraySquare(arr);
    }
}