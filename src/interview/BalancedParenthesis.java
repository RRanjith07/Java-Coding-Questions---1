package interview;

import java.util.Stack;

public class BalancedParenthesis {
    private static void validParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    System.err.println(str + " is invalid");
                    return;
                }
                char top = stack.pop();
                if (ch == '}' && top != '{' ||
                        ch == ']' && top != '[' ||
                        ch == ')' && top != '(') {
                    System.err.println(str + " is invalid");
                    return;
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println(str + " is valid");
        } else {
            System.err.println(str + " is invalid");
        }
    }

    public static void main(String[] args) {
        validParenthesis("(())[]}");

    }
}
