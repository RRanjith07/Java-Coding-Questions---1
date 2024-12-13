package interview;

import java.util.Arrays;

public class UniqueElementsInArray {

    private static void uniqueElementArray(int[] arr) {
        Arrays.sort(arr);
        int uniqueIndex = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[uniqueIndex++] = arr[i];
            }
        }
        arr[uniqueIndex++] = arr[arr.length - 1];

        for (int i = 0; i < uniqueIndex; i++) {
            System.out.println("Unique Elements: " + arr[i]);
        }
    }

    private static void duplicateElement(int[] arr) {
        int dupIndex = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
                dupIndex++;
            }
        }
    }

    private static void findUniqueElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                }
            }
            if (isUnique) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 1};
        findUniqueElements(arr);
    }
}
