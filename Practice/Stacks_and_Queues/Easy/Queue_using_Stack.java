package DSA_in_Java.Practice.Stacks_and_Queues.Easy;

import java.util.Stack;

public class Queue_using_Stack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public Queue_using_Stack(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x){
        first.push(x);
    }

    public int pop(){
        while(!first.isEmpty()){
            int data = first.pop();
            second.push(data);
        }
        int temp = second.pop();
        while(!second.isEmpty()){
            int temp2 = second.pop();
            first.push(temp2);
        }
        return temp;
    }

    public int peek(){
        while(!first.isEmpty()){
            int data = first.pop();
            second.push(data);
        }
        int temp = second.pop();
        first.push(temp);
        while(!second.isEmpty()){
            int temp2 = second.pop();
            first.push(temp2);
        }
        return temp;
    }

    public boolean empty(){
        return(first.isEmpty());
    }
}
