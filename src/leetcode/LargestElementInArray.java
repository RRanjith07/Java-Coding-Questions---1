package leetcode;

public class LargestElementInArray {
    private static void findElements(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        for (int number : arr) {
            if (number > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number < largest) {
                thirdLargest = secondLargest;
                secondLargest = number;
            } else if (number > thirdLargest && number < secondLargest) {
                thirdLargest = number;
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);
        System.out.println(thirdLargest);
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 1090, 34, 34, 1, 199, 199};
        findElements(arr);

    }
}
