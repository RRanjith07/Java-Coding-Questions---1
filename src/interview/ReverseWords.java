package interview;

public class ReverseWords {

    private static String reverseAlphabeticParts(String str) {
        StringBuilder currentWord = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                if (!currentWord.isEmpty()) {
                    result.append(currentWord.reverse());
                    currentWord.setLength(0);
                }
                result.append(ch);
            } else {
                currentWord.append(ch);
            }
        }
        if (!currentWord.isEmpty()) {
            result.append(currentWord.reverse());
        }
        return result.toString();
    }

    private static String test(String str) {
        StringBuilder currentWord = new StringBuilder();
        StringBuilder output = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                if (!currentWord.isEmpty()) {
                    output.append(currentWord.reverse());
                    currentWord.setLength(0);
                }
                output.append(ch);
            }
           else{
                currentWord.append(ch);
            }
        }
        if (!currentWord.isEmpty()){
            output.append(currentWord.reverse());
        }
        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(test("123this456is789tree"));
    }
}
