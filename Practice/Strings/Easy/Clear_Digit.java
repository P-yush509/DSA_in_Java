package DSA_in_Java.Practice.Strings.Easy;

import java.util.Stack;

public class Clear_Digit {
    public static String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();
        int i = 0;
        while(i<s.length()){
            char ch = s.charAt(i);
            if(!Character.isDigit(ch)){
                stack.push(ch);
            }else if(!stack.isEmpty()){     // this code is in else condition means it will only run if ch is a digit hence no need to check it here also
                stack.pop();
            }
            i++;
        }
        while(!stack.isEmpty()){
            builder.append(stack.pop());
        }
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(clearDigits("abc"));
        System.out.println(clearDigits("cb34"));
    }
}
