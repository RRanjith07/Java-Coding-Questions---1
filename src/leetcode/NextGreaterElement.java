package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    private static void nextGreaterElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> ngeMap = new HashMap<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            int currentElement = arr[i];
            // Pop elements from the stack that are smaller or equal to the current element
            while (!stack.isEmpty() && stack.peek() <= currentElement) {
                stack.pop();
            }
            // The next greater element is the top of the stack if the stack is not empty
            int nextGreaterElement = stack.isEmpty() ? -1 : stack.peek();
            ngeMap.put(currentElement, nextGreaterElement);

            // Push the current element onto the stack
            stack.push(currentElement);
        }

        // Print the Next Greater Element for each element in the array
        for (int element : arr) {
            System.out.println(element + " --> " + ngeMap.get(element));
        }
    }

    private static void nextGE(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            int currentElement = arr[i];

            while (!stack.isEmpty() && stack.peek() <= currentElement) {
                stack.pop();
            }
            int nextGreatestElement = stack.isEmpty() ? -1 : stack.peek();
            map.put(currentElement, nextGreatestElement);
            stack.push(currentElement);
        }
        for (int ele : arr) {
            System.out.println(ele + " : " + map.get(ele));
        }
    }

    private static void nextGEle(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            int currentElement = arr[i];
            while (!stack.isEmpty() && stack.peek() < currentElement) {
                stack.pop();
            }
            int nextElement = stack.isEmpty() ? -1 : stack.peek();
            map.put(currentElement, nextElement);
            stack.push(currentElement);
        }
        for (int ele : arr) {
            System.out.println(ele + " : " + map.get(ele));
        }
    }

    private static void test(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            int currentElement = arr[i];
            while (!stack.isEmpty() && stack.peek() < currentElement) {
                stack.pop();
            }
            int nextElement = stack.isEmpty() ? -1 : stack.peek();
            map.put(currentElement, nextElement);
            stack.push(currentElement);
        }
        for (int ele : arr) {
            System.out.println(ele + ": " + map.get(ele));
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 5, 3, 1};
        test(arr);
    }
}
