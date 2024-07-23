package DSA_in_Java.Stack.Custom_Stack;

public class StackMain {
    public static void main(String[] args) throws Exception {
//        CustomStack stack = new CustomStack(5);
        CustomStack stack = new DynamcStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
