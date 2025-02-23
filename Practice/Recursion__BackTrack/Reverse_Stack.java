package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.Stack;

public class Reverse_Stack {
    static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);

        bottomInsertion(s , top);
        return;
    }

    public static void bottomInsertion(Stack<Integer> s, int value){
        if(s.isEmpty()){
            s.push(value);
            return;
        }
        int data = s.pop();
        bottomInsertion(s,value);
        s.push(data);
        return;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        reverse(s);
        System.out.println(s);
    }
}
