package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ExpandString {
    private static String expandString(String str) {
        char[] inputArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputArray.length; i++) {
            if (Character.isAlphabetic(inputArray[i])) {
                sb.append(inputArray[i]);

            } else {
                int count = Character.getNumericValue(inputArray[i]);
                for (int j = 1; j < count; j++) {
                    sb.append(inputArray[i - 1]);
                }
            }
        }
        return sb.toString();
    }

    private static void expandsString(String str) {
        //AAABBBCC A3B3C2
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue());
        }
    }

//    A2B3C1->AABBBC
//    AAABBBC ->A3B3C1
//    ABCDE4D2-> ABCDE1111D11

    private static String test1(String str) {
        //    A2B3C1->AABBBC
        StringBuilder sb = new StringBuilder();
        char[] words = str.toCharArray();
        for (char ch : words) {
            if (Character.isAlphabetic(ch)) {
                sb.append(ch);
            } else if (Character.isDigit(ch)) {
                int count = Character.getNumericValue(ch);
                for (int j = 1; j < count; j++) {
                    sb.append(sb.charAt(sb.length() - 1));
                }
            }
        }
        return sb.toString();
    }

    private static void test2(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch, 1) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue());
        }
    }

    private static String test3(String str) {
        //ABCDE4D2-> ABCDE1111D11
        char[] input = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            if (Character.isAlphabetic(input[i])) {
                sb.append(input[i]);
            } else if (Character.isDigit(input[i])) {
                int count = Character.getNumericValue(input[i]);
                sb.append("1".repeat(count));

            }
        }
        return sb.toString();
    }

    private static boolean validParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("Given String" + str + " is invalid");
                    return false;
                }
                char top = stack.pop();
                if (ch == '}' && top != '{' ||
                        ch == ')' && top != '(' ||
                        ch == ']' && top != '[') {
                    System.out.println("Given String" + str + " is invalid");
                    return false;
                }
            }
        }
        System.out.println(stack);
        if (stack.isEmpty()) {
            System.out.println("Given String" + str + " is valid");
            return true;
        } else {
            System.out.println("Given String" + str + " is invalid");
            return false;
        }
    }

    public static void main(String[] args) {
//        System.out.println(test3("ABCDE4D2"));
        validParenthesis("(()");
    }
}
