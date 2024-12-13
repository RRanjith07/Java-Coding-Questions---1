package interview;

import java.util.ArrayList;
import java.util.List;

public class SquareEvenNumber {
    /*
Q1: Using list comprehension convert given list with square of even numbers.
Given_list = [1,4,3,6,8]
result = [1,16,3,36,64]
Explanation: 4, 6, 8 are even numbers so they are replaced by their squares.
     */
    private static List<Integer> squareList(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int number : list) {
            if (number % 2 == 0) {
                result.add(number * number);
            } else {
                result.add(number);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 4, 3, 6, 8);
        System.out.println(squareList(list));
    }
}
