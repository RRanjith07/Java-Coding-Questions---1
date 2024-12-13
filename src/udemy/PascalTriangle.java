package udemy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    private static List<List<Integer>> generatePascalTriangle(int rows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < rows; i++) {
            List<Integer> previousRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();

            currentRow.add(1);//adding 1 at the starting

            // adding numbers in between
            for (int j = 1; j < i; j++) {
                currentRow.add(previousRow.get(j - 1) + previousRow.get(j));
            }
            currentRow.add(1);//adding 1 at the end
            triangle.add(currentRow);
        }
        return triangle;
    }

    private static List<List<Integer>> pascal(int rows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> first_Row = new ArrayList<>();
        first_Row.add(1);
        triangle.add(first_Row);
        for (int i = 1; i < rows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            List<Integer> previousRow = triangle.get(i - 1);
            currentRow.add(1);
            for (int j = 1; j < i; j++) {
                currentRow.add(previousRow.get(j - 1) + previousRow.get(j));
            }
            currentRow.add(1);
            triangle.add(currentRow);
        }
        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(pascal(5));
    }
}
