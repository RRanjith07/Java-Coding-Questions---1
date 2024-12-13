package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SecondHighestElement {
    public static void secondLargest(int[] arr) {
        //{1, 2, 4, 34, 35, 35, 36, 36, 36};

        int firstHighest = 0;
        int secondHighest = 0;
        int thirdHighest = 0;

        HashSet<Integer> set = new HashSet<>();
        for (int number: arr){
            set.add(number);

            if(number>firstHighest){
                thirdHighest = secondHighest;
                secondHighest = firstHighest;//0
                firstHighest = number;// 1
            }
            else if(number>secondHighest && number<firstHighest){
                thirdHighest = secondHighest;
                secondHighest = number;
            } else if (number>thirdHighest && number<secondHighest) {
                thirdHighest = number;
            }
        }
        System.out.println("First Highest Number: "+firstHighest);
        System.out.println("Second Highest Number: "+secondHighest);
        System.out.println("Third Highest Number: "+thirdHighest);
    }

    public static void secondHighest(int[]arr){
        Set<Integer> set = new TreeSet<>();
        for (int num: arr){
            set.add(num);
        }
        Object[] array = set.toArray();
        Object thirdHighest = array[array.length-3];

      if (set.size()<3){
          System.out.println("The array does not have three unique elements.");
          return;
      }
      System.out.println(thirdHighest);
    }
    public static void main(String[] args) {
        int[] arr = {1, 6, 3,9};
        //secondLargest(arr);
        secondHighest(arr);
    }
}
