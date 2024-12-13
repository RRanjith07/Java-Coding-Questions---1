package leetcode;

import java.util.Arrays;

public class MoveZerosToLeft {
    private static void moveZerosToLeft(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        int writeIndex = arr.length - 1;
        for (int readIndex = arr.length - 1; readIndex >= 0; readIndex--) {
            if (arr[readIndex] != 0) {
                arr[writeIndex] = arr[readIndex];
                writeIndex--;
            }
        }
        while (writeIndex >= 0) {
            arr[writeIndex] = 0;
            writeIndex--;
        }
    }

    private static void moveZerosToRight(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int writeIndex = 0;
        //[1,3,40,0,0,0,1]
        for (int readIndex = 0; readIndex < arr.length; readIndex++) {
            if (arr[readIndex] != 0) {
                arr[writeIndex] = arr[readIndex];
                writeIndex++;
            }
        }
        while (writeIndex < arr.length) {
            arr[writeIndex] = 0;
            writeIndex++;
        }
    }

    private static void moveZerosToLeftPos(int[] arr) {
        int writeIndex = arr.length - 1;
        for (int currentIndex = arr.length - 1; currentIndex >= 0; currentIndex--) {
            if (arr[currentIndex] != 0) {
                arr[writeIndex] = arr[currentIndex];
                writeIndex--;
            }
        }
        while (writeIndex >= 0) {
            arr[writeIndex] = 0;
            writeIndex--;
        }
    }

    private static void moveZerosToRightPos(int[] arr) {
        int writeIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[writeIndex] = arr[i];
                writeIndex++;
            }
        }
        while (writeIndex < arr.length) {
            arr[writeIndex] = 0;
            writeIndex++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 0, 0, 0, 5};
        int arr1[] = {1, 3, 0, 0, 0, 5};
        moveZerosToRightPos(arr);
        System.out.println(Arrays.toString(arr));
//        moveZerosToRight(arr1);
//        System.out.println(Arrays.toString(arr1));
    }
}
