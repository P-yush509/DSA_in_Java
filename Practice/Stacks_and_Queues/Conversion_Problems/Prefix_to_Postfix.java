package DSA_in_Java.Practice.Stacks_and_Queues.Conversion_Problems;

import java.util.Stack;

public class Prefix_to_Postfix {
    public static String preToPost(String pre_exp) {
        Stack<String> stack = new Stack<>();
        for (int i = pre_exp.length()-1; i >=0 ; i--) {
            char ch = pre_exp.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                stack.push(Character.toString(ch));
            }else {
                String top1 = stack.pop();
                String top2 = stack.pop();
                stack.push(top1+top2+ch);
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        System.out.println(preToPost("*-A/BC-/AKL"));
    }
}
