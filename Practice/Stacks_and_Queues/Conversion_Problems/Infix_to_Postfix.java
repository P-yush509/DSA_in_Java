package DSA_in_Java.Practice.Stacks_and_Queues.Conversion_Problems;

import java.util.HashMap;
import java.util.Stack;

public class Infix_to_Postfix {
    public static String infixToPostfix(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        HashMap<Character , Integer> map = new HashMap<>();
        map.put('(',0);
        map.put(')',0);
        map.put('+',1);
        map.put('-',1);
        map.put('*',2);
        map.put('/',2);
        map.put('^',3);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){  //If ch is alphabet
                ans.append(ch);
            } else if (ch=='(' || stack.isEmpty()) {        //if ch is an operator and stack is empty
                stack.push(ch);
            } else if (ch==')') {
                while (stack.peek()!='('){
                    ans.append(stack.pop());
                }
                stack.pop();
            } else if (map.get(ch) > map.get(stack.peek())) {
                stack.push(ch);
            } else if (map.get(ch) <= map.get(stack.peek())) {
                while (!stack.isEmpty() && stack.peek()!='(' && map.get(ch) <= map.get(stack.peek())){
                    ans.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(infixToPostfix("a+b*(c^d-e)^(f+g*h)-i"));
        System.out.println(infixToPostfix("A*(B+C)/D"));
        System.out.println(infixToPostfix("(a+b)*(c+d)"));
    }
}
