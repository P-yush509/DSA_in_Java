package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.Stack;

public class Sort_Stack {
    public static Stack<Integer> sort(Stack<Integer> s) {
        if(s.isEmpty()){
            return s;
        }
        int popped = s.pop();
        sort(s);
        sortedInsertion(s, popped);
        return s;
    }

    public static Stack<Integer> sortedInsertion(Stack<Integer> s, int val){
        if(s.isEmpty() || s.peek() <= val){
            s.push(val);
            return s;
        }
        int top = s.pop();
        sortedInsertion(s, val);
        s.push(top);
        return s;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(11);
        s.push(2);
        s.push(32);
        s.push(3);
        s.push(41);
        System.out.println(sort(s));
    }
}
