package DSA_in_Java.Practice.Stacks_and_Queues.Conversion_Problems;

import java.util.Stack;

public class Postfix_to_Prefix {
    public static String postToPre(String post_exp) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < post_exp.length(); i++) {
            char ch = post_exp.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                stack.push(Character.toString(ch));
            }else {
                String top1 = stack.pop();
                String top2 = stack.pop();
                stack.push(ch+top2+top1);
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        System.out.println(postToPre("ABC/-AK/L-*"));
        System.out.println(postToPre("ab+"));
    }
}
