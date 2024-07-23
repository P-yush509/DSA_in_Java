package DSA_in_Java.Queue.Custom_queue;

public class CircularQueue {
    protected int [] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);     // use 2 of "this" keyword is to call it as a constructor
    }

    public CircularQueue(int size){
        this.data = new int[size];  // use 1 of "this" keyword is to reference the object
    }

    public boolean isFull() {
        return size == data.length; //ptr is at last index
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(int item){
        if(isFull()){
            return;
        }
        data[end++]=item;
        end = end % data.length;
        size++;
    }

    public int remove() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[front++];

        front = front % data.length;
        size--;
        return removed;
    }

    public int peek_front() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[front];
    }

    public void display(){
        if (isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        int i = front;
        do{
            System.out.print(data[i]+" -> ");
            i++;
            i %= data.length;
        }while (i!=end);
        System.out.println("END");
    }

}
