package interview;

public class RemoveDuplicatesAndPlace {
    private static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        int uniqueIndex = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[uniqueIndex] = arr[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicates(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                System.out.print(nums[i] + " ");
            } else {
                System.out.print("_");
            }
        }
    }
}
