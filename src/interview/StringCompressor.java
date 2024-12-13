package interview;

public class StringCompressor {
    private static String compressString(String str) {
        char[] chars = str.toCharArray();
        int count = 1;
        String result = "";
        for (int i = 1; i < str.length(); i++) {
            if (chars[i - 1] == chars[i]) {
                count++;
            } else {
                result = result + chars[i - 1];
                if (count > 1) {
                    result = result + count;
                }
                count = 1;
            }
        }
        result = result + chars[chars.length - 1];
        if (count > 1) {
            result = result + count;
        }
        return result;
    }

    private static String test(String str) {
        String result = "";
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                count++;
            } else {
                result = result + str.charAt(i - 1);
                if (count > 1) {
                    result = result + count;
                }
                count = 1;
            }
        }
        result = result + str.charAt(str.length() - 1);
        if (count>1){
            result = result+count;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(test("aaabbbacffffww"));
    }
}
