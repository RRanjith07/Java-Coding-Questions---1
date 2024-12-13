package udemy;

public class ContainerWithMostWater {

    private static int containerWithMostWater(int[] height) {
        // {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;

        while (start < end) {
            // Calculate the width and the height of the container
            int width = end - start;
            int currentHeight = Math.min(height[start], height[end]);
            int area = width * currentHeight;

            // Update maxArea if the current area is larger
            maxArea = Math.max(maxArea, area);

            // Move the pointer pointing to the shorter line
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxArea;
    }

    private static int test(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int maxArea = 0;

        while (start < end) {
            int width = end - start;
            int currentHeight = Math.min(arr[start], arr[end]);
            int area = width * currentHeight;
            maxArea = Math.max(maxArea, area);

            if (arr[start] < arr[end]) {
                start++;
            } else end--;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int answer = test(height);
        System.out.println(answer);
    }
}
