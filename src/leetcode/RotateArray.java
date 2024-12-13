package leetcode;

import java.util.Arrays;

public class RotateArray {
    /*
        1. reverse entire array (0,arr.length-1)
        2. reverse first k elements (0, k-1)
        3. reverse k to arr,length-1 (k, arr.length-1)
         */
    private static void rotateArray(int arr[], int steps) {
        steps = steps % arr.length;
        if (arr.length == 0 || steps % arr.length == 0) {
            return; // No need to rotate
        }
        reverse(arr, 0, arr.length - 1);//reversing the entire array
        //[1,2,3,4,5,6,7]=> [7,6,5,4,3,2,1]
        reverse(arr, 0, steps - 1);// reversing the first k elements
        // [7,6,5,4,3,2,1] => [5,6,7,4,3,2,1]
        reverse(arr, steps, arr.length - 1);// reversing from k to end of the array
        //[5,6,7,4,3,2,1] => [5,6,7,1,2,3,4]
    }

    private static void reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void rotateArr(int[] arr, int k) {
        k = k % arr.length;
        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, arr.length - 1);
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 1;
        rotateArr(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
