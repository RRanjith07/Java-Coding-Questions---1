package interview;

public class ReplaceChar {
    private static String replaceChar(String str) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == 'o') {
                count++;
                sb.append("$".repeat(count));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceChar("Go to Joho"));
    }
}
