package leetcode;

import java.util.Arrays;

public class MoveNegativeNumbersToStart {
    private static void moveNegativeNumber(int[] arr) {
        int negativeNumberPos = 0;
        for (int currentElement = 0; currentElement < arr.length; currentElement++) {
            if (arr[currentElement] < 0) {
                //swap
                int temp = arr[negativeNumberPos];
                arr[negativeNumberPos] = arr[currentElement];
                arr[currentElement] = temp;
                negativeNumberPos++;
            }
        }
    }

    private static void moveNegativeNumberToEnd(int[] arr) {
        int negativeNumberPos = arr.length - 1;
        for (int currentElement = arr.length - 1; currentElement >= 0; currentElement--) {
            if (arr[currentElement] < 0) {
                int temp = arr[negativeNumberPos];
                arr[negativeNumberPos] = arr[currentElement];
                arr[currentElement] = temp;
                negativeNumberPos--;
            }
        }
    }

    private static void moveNegativeNumberToStart(int[] arr) {
        int negativeNumberPointer = 0;
        for (int currentElement = 0; currentElement < arr.length; currentElement++) {
            if (arr[currentElement] < 0) {
                int temp = arr[negativeNumberPointer];
                arr[negativeNumberPointer] = arr[currentElement];
                arr[currentElement] = temp;
                negativeNumberPointer++;
            }
        }
    }

    private static void moveNegativeNumToEnd(int[] arr) {
        int np = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 0) {
                int temp = arr[np];
                arr[np] = arr[i];
                arr[i] = temp;
                np--;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, 5, 7, -8};
        moveNegativeNumToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
