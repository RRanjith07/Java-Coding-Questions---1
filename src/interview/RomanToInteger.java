package interview;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    private static int romanToInteger(String number) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);

        if (!isValidRomanNumeral(number, romanMap)) {
            throw new IllegalArgumentException("Invalid Roman numeral: " + number);
        }

        int result = 0;
        int previousVal = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(number.charAt(i));
            if (currentValue < previousVal) {
                result = result - currentValue;
            } else {
                result = result + currentValue;
            }
            previousVal = currentValue;
        }
        return result;
    }

    private static boolean isValidRomanNumeral(String number, Map<Character, Integer> romanMap) {
        for (char ch : number.toCharArray()) {
            if (!romanMap.containsKey(ch)) {
                return false; // Contains invalid characters
            }
        }
        // Additional checks for valid Roman numeral structure can be added here
        // For example: Avoid invalid sequences like IIXX, IIV, etc.

        return true;
    }

    private static int romanInteger(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('X', 10);
        map.put('I', 1);
        map.put('V', 5);

        int result = 0;
        int prevValue = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            int currentValue = map.get(str.charAt(i));
            if (currentValue < prevValue) {
                result = result - currentValue;
            } else {
                result = result + currentValue;
            }
            prevValue = currentValue;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanInteger("XX"));
    }
}
