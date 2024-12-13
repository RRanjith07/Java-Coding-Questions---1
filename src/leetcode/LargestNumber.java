package leetcode;

import java.util.Arrays;

public class LargestNumber {
    private static void secondLargest(int[] arr){
        Arrays.sort(arr);//1,3,5,6,6
        int highest = arr[arr.length-1];//6
        for(int i = arr.length-1;i>=0;i--)
        {
            if(highest>arr[i])
            {
                System.out.println("Second Largest element will be: "+ arr[i]);
                break;
            }
        }
    }
    private static void secondLargestElement(int arr[])
    {
        if(arr == null || arr.length<2){
            System.out.println("Atleast 2 elements should be present in the array");
        }
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int number : arr)
        {
            if(number >firstHighest)
            {
                secondHighest = firstHighest;
                firstHighest = number;
            } else if (number>secondHighest && number<firstHighest) {
                secondHighest = number;
            }
        }
        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements are the same).");
        } else {
            System.out.println("Second Largest element is: " + secondHighest);
        }
    }

    public static void main(String[] args) {
        int []arr = {1,4,5,6,7,8,9,9,10};
        secondLargestElement(arr);
        secondLargestElement(arr);

//        int a=1000;
//        int b= 20000;
//        int c = 300000;
//
//        if(a>b && a>c){
//            System.out.println(a+ " is Largest");
//        } else if (b>c) {
//            System.out.println(b+ " is Largest");
//        }
//        else {
//            System.out.println(c+" is largest");
//        }
    }
}
