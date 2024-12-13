package interview;

public class Maximum_SubArray {
    private static int maximumSubArray(int[] arr) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max(arr[i],arr[i]+currentSum);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3};
        System.out.println(maximumSubArray(arr));
    }
}
