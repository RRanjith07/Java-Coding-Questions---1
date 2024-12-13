package interview;

import java.util.HashMap;
import java.util.Map;

public class WordOccurrenceCounter {
    /*
    1. convert the paragraph to lower case
    2. add the finding words to the map
    3. Count the occurrence of that finding words
     */
    private static void findWords(String paragraph, String... words) {

        // Use replaceAll to remove non-alphabetic characters except spaces
        String[] paraWords = paragraph.toLowerCase().replaceAll("[^a-zA-Z\\s]", "").split("\\s+");

        // Initialize a map to store counts of the words to find
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word.toLowerCase(), 0);
        }
        System.out.println(map);

        // Count occurrences in the paragraph
        for (String word : paraWords) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }
        }
        System.out.println(map);

        // Print the occurrences of each word
        for (String word : words) {
            System.out.println(word + " : " + map.get(word.toLowerCase()));
        }
    }

    private static void findWordss(String paragraph, String... words) {
        String[] paraWords = paragraph.toLowerCase().replaceAll("[^a-zA-Z\\s]", "").split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word.toLowerCase(), 0);
        }
        for (String word : paraWords) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }
        }
        for (String word : words) {
            System.out.println(word + " :" + map.get(word.toLowerCase()));
        }
    }

    public static void main(String[] args) {
        String paragraph = "India is my country.\n" +
                "All Indians are my brothers and sisters.\n" +
                "I love my country and I am proud of its rich and varied heritage.\n" +
                "I shall always strive to be worthy of it.\n" +
                "I shall give my parents, teachers, and all elders respect, and treat everyone with courtesy.\n" +
                "To my country and my people, I pledge my devotion.\n" +
                "In their well-being and prosperity alone lies my happiness";
        findWords(paragraph, "my", "country");
    }
}
