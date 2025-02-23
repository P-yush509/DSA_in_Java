package DSA_in_Java.Practice.Stacks_and_Queues.Easy;

import java.util.Stack;

public class Valid_Parenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack1 = new Stack<>();
        if ((s.length()&1)==1){     // odd sized string can't be valid
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (stack1.isEmpty() && (ch ==')' || ch=='}' || ch ==']')){
                return false;
            }else if(ch =='(' || ch=='{' || ch =='['){
                stack1.push(ch);
            } else if ((ch ==')' && stack1.peek()=='(') || (ch=='}' && stack1.peek()=='{') || (ch ==']' && stack1.peek()=='[')) {
                stack1.pop();
            }else {
                return false;
            }
        }
        return stack1.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("(])"));
        System.out.println(isValid("([{}])"));
        System.out.println(isValid("([}{])"));
        System.out.println(isValid("(()({})[{}])"));
        System.out.println(isValid("){"));
    }
}
