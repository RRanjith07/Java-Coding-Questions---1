package udemy;

import java.util.Arrays;

public class Squares_of_a_Sorted_Array {
    private static int[] squaresOfSortedArray(int[] arr) {
        int productPointer = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[productPointer] = arr[i] * arr[i];
            productPointer++;
        }
        Arrays.sort(arr);
        return arr;
    }

    private static int[] sortedSquares(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int index = arr.length - 1;
        int[] result = new int[arr.length - 1];

        //{-7, -3, 2, 3, 11, 4}
        while (start <= end) {
            int leftSquare = arr[start] * arr[start];//49
            int rightSquare = arr[end] * arr[end];//16

            if (leftSquare > rightSquare) {
                arr[index] = leftSquare;
                start++;
            } else {
                result[index] = rightSquare;
                end--;
            }
            index--;
        }
        return result;
    }

    private static int[] test(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int[] result = new int[arr.length];
        int currentIndex = arr.length - 1;

        while (start <= end) {
            int startSquare = arr[start] * arr[start];
            int endSquare = arr[end] * arr[end];
            if (startSquare > endSquare) {
                result[currentIndex] = startSquare;
                start++;
            } else {
                result[currentIndex] = endSquare;
                end--;
            }
            currentIndex--;
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr1 = {-7, -3, 2, 3, 11};
//        int[] productArray = squaresOfSortedArray(arr1);
//        System.out.println(Arrays.toString(productArray));

        int[] answer = test(arr1);
        System.out.println(Arrays.toString(answer));
    }
}