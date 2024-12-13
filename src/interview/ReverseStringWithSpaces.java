package interview;

public class ReverseStringWithSpaces {
    private static String reverseStringKeepingSpaces(String input) {
        //convert the input to char array
        char[] inputArray = input.toCharArray();
        int start = 0;
        int end = inputArray.length - 1;

        while (start < end) {
            // Skip spaces at currentIndex
            if (inputArray[start] == ' ') {
                start++;
            }
            // Skip spaces at lastIndex
            if (inputArray[end] == ' ') {
                end--;
            }
            // Swap non-space characters
            else {
                char temp = inputArray[start];
                inputArray[start] = inputArray[end];
                inputArray[end] = temp;
                start++;
                end--;
            }
        }
        return new String(inputArray);
    }

    private static String reverse(String input) {
        char[] inputArray = input.toCharArray();
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (inputArray[start] == ' ') {
                start++;
            }
            if (inputArray[end] == ' ') {
                end--;
            } else {
                char temp = inputArray[start];
                inputArray[start] = inputArray[end];
                inputArray[end] = temp;
            }
            start++;
            end--;
        }
        return new String(inputArray);
    }

    private static String reverseWords(String str) {
        int start = 0;
        int end = str.length() - 1;
        char[] inputArray = str.toCharArray();
        while (start < end) {
            if (inputArray[start] == ' ') {
                start++;
            } else if (inputArray[end] == ' ') {
                end--;
            } else {
                char temp = inputArray[start];
                inputArray[start] = inputArray[end];
                inputArray[end] = temp;
                start++;
                end--;

            }
        }
        return new String(inputArray);
    }

    public static void main(String[] args) {
        String input = " I Am Not String";
        String output = reverseWords(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
