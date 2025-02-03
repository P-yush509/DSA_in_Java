package DSA_in_Java.Practice.Stacks_and_Queues.Easy;

public class Stack_using_Array {
    private int[] arr;
    private int top;

    public Stack_using_Array() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        if (top==arr.length-1){
            System.out.println("Stack is FULL");
            return;
        }
        top++;
        arr[top]=x;
    }

    public int pop() {
        if (top==-1){
            System.out.print("Stack is EMPTY hence ");
            return -1;
        }
        int val = arr[top];
        arr[top]=0;
        top--;
        return val;
    }

    public static void main(String[] args) {
        Stack_using_Array stack1 = new Stack_using_Array();

        stack1.push(10);
        stack1.push(20);
        stack1.push(30);

        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
    }
}
