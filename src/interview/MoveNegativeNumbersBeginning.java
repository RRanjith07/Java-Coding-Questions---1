package interview;

import java.util.Arrays;

public class MoveNegativeNumbersBeginning {

    private static void moveNegativeNumbersBeginning(int[] arr) {
        int negativeNumberIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[negativeNumberIndex];
                arr[negativeNumberIndex] = temp;
                negativeNumberIndex++;
            }
        }
    }

    private static void moveZerosToRight(int[] arr) {
        int writeIndex = 0;
        for (int currentIndex = 0; currentIndex < arr.length; currentIndex++) {
            if (arr[currentIndex] != 0) {
                arr[writeIndex++] = arr[currentIndex];
            }
        }
        while (writeIndex < arr.length) {
            arr[writeIndex++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -50, 0, 0, 6, 0, 0, 0, -7, 5, -3, -6,};
        moveZerosToRight(arr);
        System.out.println(Arrays.toString(arr));
    }
}
