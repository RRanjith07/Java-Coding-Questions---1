package interview;

import java.util.*;

public class CommonElements {
    private static void commonElements(List<Integer> list1, List<Integer> list2) {
        list1.retainAll(list2);
        System.out.println("Common elements: " + list1);
    }

    private static void unCommonElements(List<Integer> list1, List<Integer> list2) {
        List<Integer> temp1 = new ArrayList<>(list1);
        List<Integer> temp2 = new ArrayList<>(list2);
        temp1.removeAll(list2);
        temp2.removeAll(list1);
        temp1.addAll(temp2);
        System.out.println(temp1);
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 2, 5, 7));
        commonElements(list1, list2);
    }

}
