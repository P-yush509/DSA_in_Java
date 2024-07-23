package DSA_in_Java.Queue.Custom_queue;

public class CustomQueue {
    protected int [] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);     // use 2 of "this" keyword is to call it as a constructor
    }

    public CustomQueue(int size){
        this.data = new int[size];  // use 1 of "this" keyword is to reference the object
    }


    public boolean isFull() {
        return end == data.length; //ptr is at last index
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public void insert(int item){
        if(isFull()){
            return;
        }
        data[end++]=item;
    }

    public int remove() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[0];

        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int peek_front() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" -> ");
        }
        System.out.println("END");
    }
}
