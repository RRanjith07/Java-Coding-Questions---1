package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiplyNumber {

    private static int maxDifference(int[] arr){
        int maxDiff = 0;
       for (int i=0;i<arr.length-1;i++){
           if(arr[i+1] - arr[i] > maxDiff)
           {
               maxDiff = arr[i+1] - arr[i];
           }
       }
       return maxDiff;

    }
    private static void multiplyNumber(int a, int b){
        int sum = 0;
        while (b!=0)
        {
            sum = sum+a;
            b--;
        }
        System.out.println(sum);
    }

    private static void compareArray(int[]a, int[]b){
        //a = {1,4,5,7}
        //b = {1,5,5,7}
        //output =>{1,5,7}
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i=0;i<a.length;i++){
                if(a[i]==b[i]){
                    arrayList.add(a[i]);
                }
        }
        System.out.println(Arrays.toString(arrayList.toArray()));
    }
    public static void main(String[] args) {
        //multiplyNumber(5,10);
        int arr[] = {0,300,4,6,8,9,10,200};
        int maxDiff = maxDifference(arr);
        System.out.println(maxDiff);

        int[]a = {1,4,5,7};
        int[]b = {1,5,5,7};
        compareArray(a,b);

    }
}
