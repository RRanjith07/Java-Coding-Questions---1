package leetcode;

public class CheckWheatherArraySorted {
    private static void isSorted(int arr[]) {
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Given array is sorted...");
        } else {
            System.out.println("Given array is not sorted...");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6};
        isSorted(arr);
    }
}
