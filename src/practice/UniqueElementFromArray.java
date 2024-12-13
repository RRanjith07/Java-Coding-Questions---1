package practice;


import java.util.HashMap;
import java.util.Map;

public class UniqueElementFromArray {
    private static void printUniqueNumber(int arr[]){
        //[1,2,2,3,4,5,6,7,7,6]
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int number: arr){
            if(map.containsKey(number)){
                map.put(number, map.get(number)+1);
            }
            else{
                map.put(number,1);
            }
        }
        System.out.println(map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue()==1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,2,3,4,5,6,7,7,6};
        printUniqueNumber(a);
    }
}
