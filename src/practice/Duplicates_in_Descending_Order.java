package practice;

import java.util.*;

public class Duplicates_in_Descending_Order {

    private static void findDuplicatesInDescendingOrder(int arr[])
    {
        //{1,1, 2, 3, 4, 2, 3, 4};

        Set<Integer> eleSet = new HashSet<>();
        Set<Integer> duplicateSet = new LinkedHashSet<>();

        for (int num: arr) {
            duplicateSet.add(num);
        }
        List<Integer> duplicateList = new ArrayList<>(duplicateSet);
        System.out.println("Dup List before reverse"+duplicateList);
        Collections.sort(duplicateList, Collections.reverseOrder());

        for (int num: duplicateList)
        {
            System.out.print(num+ " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,1, 2, 3, 4, 2, 3, 4};
        findDuplicatesInDescendingOrder(arr);
    }
}
