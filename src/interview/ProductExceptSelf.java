package interview;

import java.util.Arrays;

public class ProductExceptSelf {
    private static int[] productExceptSelf(int[] arr) {
        int[] res = new int[arr.length];
        // Step 1: Calculate prefix products
        res[0] = 1; // First element has no prefix product
        for (int i = 1; i < arr.length; i++) {
            res[i] = res[i - 1] * arr[i - 1];
        }

        // Step 2: Calculate suffix products and combine with prefix products
        int postfix = 1; // Initialize suffix product
        for (int i = arr.length - 1; i >= 0; i--) {
            res[i] = res[i] * postfix;  // Multiply by the current suffix product
            postfix = postfix * arr[i]; // Update the suffix product
        }
        return res;
    }

    private static int[] productExpSelf(int[] arr) {
        int[] res = new int[arr.length];
        res[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            res[i] = res[i - 1] * arr[i - 1];
        }
        int postfix = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            res[i] = postfix * res[i];
            postfix = postfix * arr[i];
        }
        return res;
    }

    private static int[] test(int[] arr) {
        int[] res = new int[arr.length];
        res[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            res[i] = res[i - 1] * arr[i - 1];
        }
        int postfix = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            res[i] = res[i] * postfix;
            postfix = postfix * arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};
        int[] arr = test(num);
        System.out.println(Arrays.toString(arr));
    }
}
