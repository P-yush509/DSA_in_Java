package DSA_in_Java.Practice.Stacks_and_Queues.Easy;

public class Queue_using_Array {
    private int front, rear;
    private int arr[] = new int[100005];

    public Queue_using_Array()
    {
        front=0;
        rear=0;
    }

    public void push(int x)
    {
        if (rear==arr.length-1){
//            System.out.println("Queue is FULL");
            return;
        }
        arr[rear]=x;
        rear++;
    }

    public int pop()
    {
        if (front==rear){
//            System.out.println("Queue is EMPTY");
            return -1;
        }
        int popped = arr[front];
        arr[front]=0;
        front++;
        return popped;
    }

    public boolean isEmpty(){
        if (front==rear){
            return true;
        }
        return false;
    }

    public int size(){
        if (isEmpty()) return 0;
        int count = 0;
        for (int i = front; i < rear; i++) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Queue_using_Array queue1 = new Queue_using_Array();

        queue1.push(1);
        queue1.push(2);
        queue1.push(3);
        queue1.push(4);
        queue1.push(5);

        System.out.println(queue1.size());

        System.out.println(queue1.pop());
        System.out.println(queue1.pop());
        System.out.println(queue1.pop());
        System.out.println(queue1.pop());

        System.out.println(queue1.isEmpty());

        System.out.println(queue1.pop());

        System.out.println(queue1.isEmpty());

        System.out.println(queue1.size());

        System.out.println(queue1.pop());
    }
}
