package DSA_in_Java.Practice.Stacks_and_Queues.Conversion_Problems;

import java.util.Stack;

public class Postfix_to_Infix {
    public static String postToInfix(String exp) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                stack.push(Character.toString(ch));
            }else {
                String last = stack.pop();
                String lastSecond = stack.pop();
                stack.push('('+lastSecond + ch + last+')');
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        System.out.println(postToInfix("ab*c+"));
    }
}
