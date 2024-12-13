package interview;

import java.util.Arrays;

public class MoveZeros {

    private static void moveZerosToLeft(int[] arr) {
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

    private static void moveZerosToRight(int[] arr) {
        int writeIndex = 0;
        for (int currentIndex = 0; currentIndex < arr.length; currentIndex++) {
            if (arr[currentIndex] != 0) {
                arr[writeIndex] = arr[currentIndex];
                writeIndex++;
            }
        }
        while (writeIndex < arr.length) {
            arr[writeIndex] = 0;
            writeIndex++;
        }
    }

    private static void moveZerosToStart(int[] arr) {
        int writeIndex = 0;
        for (int currentIndex = 0; currentIndex < arr.length; currentIndex++) {
            if (arr[currentIndex] != 0) {
                arr[writeIndex] = arr[currentIndex];
                writeIndex++;
            }
        }
        while (writeIndex < arr.length) {
            arr[writeIndex] = 0;
            writeIndex++;
        }
    }

    private static void moveNegativeNumberToStart(int[] arr) {
        int negativeNumberIndex = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[negativeNumberIndex];
                arr[negativeNumberIndex] = temp;
                negativeNumberIndex--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1, 9, 8, -3, 9, 7, -19};
        moveNegativeNumberToStart(arr);
        System.out.println(Arrays.toString(arr));
    }
}
