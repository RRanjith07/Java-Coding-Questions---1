package udemy;

import java.util.Stack;

public class BackSpaceStringCompare {
    private static boolean backSpaceString(String str1, String str2) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (char ch : str1.toLowerCase().toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                stack1.push(ch);
            } else if (ch == '#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            }
        }
        for (char ch : str2.toLowerCase().toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                stack2.push(ch);
            } else if (ch == '#') {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            }
        }
        return stack1.equals(stack2);
    }

    public static void main(String[] args) {
        System.out.println(backSpaceString("a##c", "#a#c"));
    }
}
