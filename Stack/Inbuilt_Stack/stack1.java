package DSA_in_Java.Stack.Inbuilt_Stack;

import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Stack <Integer> s1 = new Stack<>();
        s1.push(5);
        s1.push(4);
        s1.push(3);
        s1.push(2);
        s1.push(1);

        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
    }
}
