package practice;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = {3, 1, 9, 2};
        sortArray(arr);
       // System.out.println(Arrays.toString(arr));
    }

    public static void sortArray(int[] arr) {
        //arr[1,5,6,7,2,3,4];
        /*
        This is one way of sorting
         Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
         */
        /*
        Bubble sort Algorithm
        in one iteration it will swap arr[ij and arr[j+1]->inner loop
        again it will swap over all --> outer loop
         */
        // [3,1,9,2]

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}


/*
a =10;
b = 20;

a= a+b   a= 30
b = a-b; b = 10
a = a-b  a = 20
 */