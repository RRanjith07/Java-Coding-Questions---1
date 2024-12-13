package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    private static Integer[] removeDuplicate(int[]arr){
        //: Input: nums = [1,1,2] Output: 2
        System.out.println(Arrays.toString(arr));
        System.out.println("Length of the Array is:"+arr.length);
        System.out.println("*****************************");
        Set<Integer> set = new HashSet<>();
        for (int i =0;i<arr.length;i++){
            set.add(arr[i]);
        }
        Integer[] ans = set.toArray(new Integer[0]);
        System.out.println(Arrays.toString(ans));
        System.out.println("Length of the Array is:"+ans.length);
        return ans;
    }

    private static int removeDuplicates(int[] arr){
       if (arr.length==0) return 0;
       int count =0;
       for (int i=0;i<arr.length-1;i++){
           if( arr[i] == arr[i+1]){
               continue;
           }
           else{
               arr[count] = arr[i];
               count++;
           }
       }
        return count+1;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,5,6,6,7,8,8};
        System.out.println(arr.length);
        int length = removeDuplicates(arr);
        System.out.println(length);


    }
}
