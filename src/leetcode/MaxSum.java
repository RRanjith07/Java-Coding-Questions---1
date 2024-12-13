package leetcode;

public class MaxSum {
    private static int maxSum(int[] arr) {
        int max = arr[0];
        int currentMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            max = Math.max(max, currentMax);
        }
        return max;
    }
    private static int max(int[]arr){
        int currentMax = arr[0];
        int max = arr[0];
        for (int i=1;i<arr.length;i++){
            currentMax = currentMax+arr[i];
            if(currentMax>max){
                max = currentMax;
            }
            if (currentMax<0){
                currentMax=0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,-3,4};
        System.out.println(maxSum(arr));
        System.out.println(max(arr));
    }
}
