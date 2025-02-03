package DSA_in_Java.Practice.Stacks_and_Queues.Monotonic_Stack;

import java.util.Stack;

public class Remove_K_Digits {
    public static String removeKdigits(String num, int k) {
        if (num.length()==k)    return "0";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            while (k!=0 && !stack.isEmpty() && (num.charAt(i)-'0' < stack.peek()-'0')) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        while (k!=0){
            stack.pop();
            k--;
        }
        if (stack.isEmpty())    return "0";

        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()){
            ans.append(stack.pop());
        }
        String ansString = ans.reverse().toString();
        ansString = ansString.replaceAll("^0+", "");
        return ansString.isEmpty() ? "0" : ansString;
    }

    public static void main(String[] args) {
        System.out.println(removeKdigits("1432219",3));
        System.out.println(removeKdigits("10200",1));
        System.out.println(removeKdigits("10",2));
        System.out.println(removeKdigits("123456",3));
        System.out.println(removeKdigits("102304",2));
        System.out.println(removeKdigits("1111111",3));
        System.out.println(removeKdigits("987654321",5));
        System.out.println(removeKdigits("7654983210",4));
        System.out.println(removeKdigits("00000000000000",4));
        System.out.println(removeKdigits("159",1));
    }
}
