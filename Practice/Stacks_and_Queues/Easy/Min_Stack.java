package DSA_in_Java.Practice.Stacks_and_Queues.Easy;

public class Min_Stack {
    private int[] arr;
    private int[] minArr;
    private int top;
    private int minVal;
    private int minValIndex;

    public Min_Stack() {
        arr = new int[1000];
        minArr = new int[1000];
        top = -1;
        minVal = Integer.MAX_VALUE;
        minValIndex = -1;
    }

    public void push(int val) {
        if (top==arr.length-1){
            return;
        }
        top++;
        arr[top]=val;
        if (val<=minVal){
            minVal=val;
            minValIndex++;
            minArr[minValIndex]=val;
        }
    }

    public void pop() {
        if (top==-1){
            return;
        }
        int popped = arr[top];
        arr[top]=0;
        top--;
        if (popped==minVal){
            minArr[minValIndex]=0;
            minValIndex--;
            if (minValIndex==-1){
                minVal = Integer.MAX_VALUE;
            }else{
                minVal=minArr[minValIndex];
            }
        }
    }

    public int top() {
        if (top==-1){
            return -1;
        }
        return arr[top];
    }

    public int getMin() {
        if (top==-1 || minValIndex==-1){
            return Integer.MIN_VALUE;
        }
        return minArr[minValIndex];
    }

    public static void main(String[] args) {

        Min_Stack stack1 = new Min_Stack();
        stack1.push(-2);
        stack1.push(0);
        stack1.push(-3);
        System.out.println(stack1.getMin());
        stack1.pop();
        System.out.println(stack1.top());
        System.out.println(stack1.getMin());


        Min_Stack stack2 = new Min_Stack();
        stack2.push(0);
        stack2.push(1);
        stack2.push(0);
        System.out.println(stack2.getMin());
        stack2.pop();
        System.out.println(stack2.getMin());
    }
}
