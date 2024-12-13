package practice;

import java.util.Arrays;

public class MergeSortedArray {
    private static int[] mergeSortedArray(int[]arr1, int[]arr2){
        int[] mergedArray = new int[arr1.length+arr2.length];
        int p1 =0;
        int p2 = 0;
        int i=0;
        while (p1<arr1.length && p2<arr2.length){
            if (arr1[p1] < arr2[p2]){
                mergedArray[i++] = arr1[p1++];
            }
            else if(arr1[p1] > arr2[p2]){
                mergedArray[i++] = arr2[p2++];
            }
            else{
                mergedArray[i++] = arr1[p1++];
                mergedArray[i++] = arr2[p2++];
            }
        }
        while (p1 < arr1.length){
            mergedArray[i++] = arr1[p1++];
        }
        while (p2 < arr2.length){
            mergedArray[i++] = arr2[p2++];
        }
        return mergedArray;
    }

    private static void mergeSortedArray(int[] arr1, int m, int[]arr2,int n){
        int p1 = m-1;
        int p2 = n-1;
        int i = m+n-1;

        while (p2>=0){
            if (p1>=0 && arr1[p1]>arr2[p2]){
                arr1[i--] = arr1[p1--];
            } else  {
                arr1[i--] = arr2[p2--];
            }
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,5,8,0,0,0};
        //int arr1[] = {1,5,8};
        int arr2[] = {2, 5,7};
        int m = 3;
        int n = 3;
        mergeSortedArray(arr1,m,arr2,n);
        System.out.println(Arrays.toString(arr1));
    }
}
