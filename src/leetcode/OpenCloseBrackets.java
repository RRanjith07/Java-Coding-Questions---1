package leetcode;


import java.util.Stack;

public class OpenCloseBrackets {
    private static boolean checkValidString(String str){
        // str = "({[}])";
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()){
            if(ch=='{' || ch == '[' || ch =='('){
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()){
                    System.out.println("Given String "+str+"is invalid");
                    return false;
                }
                char top = stack.pop();
                if (ch=='}' && top!='{' ||
                    ch==']' && top!='[' ||
                    ch==')' && top!='('){
                    System.out.println("Given String "+str+"is invalid");
                    return false;
                }
            }
        }
        if (stack.isEmpty()){
            System.out.println("Given String "+str+" is Valid");
            return true;
        }
        else {
            System.out.println("Given String "+str+" is invalid");
            return false;
        }
    }
    public static void main(String[] args) {
       checkValidString("()");
       checkValidString("()[]{}");
        checkValidString("(]");
        checkValidString("([)]");
       checkValidString("{[]}");
        checkValidString("({[}])");
    }
}
