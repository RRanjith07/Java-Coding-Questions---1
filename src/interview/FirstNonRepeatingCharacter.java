package interview;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    private static int printFirstNonRepeatingCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                System.out.println("First non repeating character is " + str.charAt(i));
                return i;
            }
        }
        System.out.println("There are no non-repeating characters present.");
        return -1;
    }

    public static void main(String[] args) {
        printFirstNonRepeatingCharacter("aabbccddee");
    }
}
