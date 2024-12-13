package leetcode;

public class SearchInsertPosition {
    private static void insertPosition(int[] arr, int target){
        for (int i=0;i<arr.length;i++){
            if(arr[i] == target){
                System.out.println(i);
                return;
            }
            else if (arr[i]>target) {
                System.out.println("Target not found. It should be inserted at index: " + i);
                return;
            }
        }
        System.out.println("Target not found. It should be inserted at index: " + arr.length);

    }
    private static void insertPos(int arr[], int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;

            if (arr[mid]== target){
                System.out.println("Target "+target+" found at index: " + mid);
                return;
            }
            else if (arr[mid]< target){
                start = mid +1;
            }
            else {
                end = mid-1;
            }
        }
        System.out.println("Target not found, should be inserted at index: " + start);
    }

    public static void main(String[] args) {
        /*
     Problem: Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
•	Example: Input: nums = [1,3,5,6], target = 5 Output: 2
      */
        int[] arr = {1,3,55,6,10};
        int target = 556;
        insertPosition(arr,target);
       // insertPos(arr,target);
    }
}
