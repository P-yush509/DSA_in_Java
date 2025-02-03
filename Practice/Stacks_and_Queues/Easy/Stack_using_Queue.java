package DSA_in_Java.Practice.Stacks_and_Queues.Easy;

public class Stack_using_Queue {

    Queue_using_Array q1 ;
    Queue_using_Array q2 ;

    public Stack_using_Queue() {
        q1 = new Queue_using_Array();
        q2 = new Queue_using_Array();
    }

    public void push(int x) {
        if (q1.isEmpty()){
            q2.push(x);
        } else if (q2.isEmpty()) {
            q1.push(x);
        }
    }

    private int pop_helper(Queue_using_Array qa , Queue_using_Array qb){
        int n = qa.size();
        for (int i = 1; i < n ; i++) {
            qb.push(qa.pop());
        }
        return qa.pop();
    }

    public int pop() {
        if (q1.isEmpty() && q2.isEmpty()){
            return -1;
        } else if (q1.isEmpty()){
            return (pop_helper(q2 , q1));
        } else if (q2.isEmpty()) {
            return (pop_helper(q1 , q2));
        }
        return -1;
    }

    private int top_helper(Queue_using_Array qa , Queue_using_Array qb){
        int n = qa.size();
        for (int i = 1; i < n ; i++) {
            qb.push(qa.pop());
        }
        int topElement = qa.pop();
        qb.push(topElement);
        return topElement;
    }

    public int top() {
        if (q1.isEmpty() && q2.isEmpty()){
            return -1;
        } else if (q1.isEmpty()){
            return (top_helper(q2 , q1));
        } else if (q2.isEmpty()) {
            return (top_helper(q1 , q2));
        }
        return -1;
    }

    public boolean empty() {
        if (q1.isEmpty() && q2.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Stack_using_Queue s1 = new Stack_using_Queue();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        System.out.println(s1.top());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.empty());
        System.out.println(s1.pop());
        System.out.println(s1.empty());
    }
}
