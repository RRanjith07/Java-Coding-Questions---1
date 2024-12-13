package practice;

import java.util.*;

public class DuplicatesWithMaxOccur {
    public static void DuplicatesMaxOccur(int arr[])
    {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : arr)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        //{1=1, 2=2, 3=3, 4=4}
        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList,(a,b)-> b.getValue().compareTo(a.getValue()));

        for (Map.Entry<Integer,Integer>entry: entryList){
            int num = entry.getKey();
            int count = entry.getValue();
            for (int i =0;i <count;i++)
            {
                System.out.print(num+" ");
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,2,3,4,3,4,4};
        DuplicatesMaxOccur(arr);
    }
}
