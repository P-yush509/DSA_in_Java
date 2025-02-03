package DSA_in_Java.Practice.Stacks_and_Queues.Easy;

public class Queue_using_LL {
    class QueueNode {
        int data;
        QueueNode next;
        QueueNode(int a) {
            data = a;
            next = null;
        }
    }

    QueueNode front, rear;

    void push(int a) {
        QueueNode temp = new QueueNode(a);
        if (front==null){
            front = temp;
            rear = temp;
        }else {
            rear.next = temp;
            rear = rear.next;
        }
    }

    int pop() {
        if (front==null){
            return -1;
        }
        int popped = front.data;
        if (front.next!=null){
            front = front.next;
        }else {
            front = null;
        }
        return popped;
    }

    public static void main(String[] args) {
        Queue_using_LL q1 = new Queue_using_LL();
        q1.push(2);
        System.out.println(q1.pop());
        System.out.println(q1.pop());
        q1.push(3);
        q1.push(4);
        System.out.println(q1.pop());
        System.out.println(q1.pop());
        System.out.println(q1.pop());
    }
}
