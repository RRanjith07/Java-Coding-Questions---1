package udemy;

public class ParenthesesValidator {
    private static int minAddToMakeValid(String str) {
        int leftParentheses = 0;
        int rightParentheses = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '(')
                leftParentheses++;
            else if (ch == ')') {
                if (leftParentheses > 0) {
                    leftParentheses--;
                } else {
                    rightParentheses++;
                }
            }
        }
        return leftParentheses + rightParentheses;
    }

    private static int validParenthesis(String str) {
        int lp = 0;
        int rp = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '(')
                lp++;
            else if (ch == ')') {
                if (lp > 0) {
                    lp--;
                } else {
                    rp++;
                }
            }
        }
        return lp+rp;
    }

    public static void main(String[] args) {
        String s1 = "())";
        String s2 = "((()";

        System.out.println(validParenthesis(s2));

    }
}
