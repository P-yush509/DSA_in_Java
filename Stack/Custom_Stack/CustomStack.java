package DSA_in_Java.Stack.Custom_Stack;

public class CustomStack {
    protected int [] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);     // use 2 of "this" keyword is to call it as a constructor
    }

    public CustomStack(int size){
        this.data = new int[size];  // use 1 of "this" keyword is to reference the object
    }

    public void push(int item) throws Exception {
        if (isFull()){
            throw new Exception("Stack Overflow");
        }
        ptr++;
        data[ptr] = item;
    }

    public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Cannot pop from an empty stack");
        }
//        int popped = data[ptr];
//        ptr--;
//        return popped;
        return data[ptr--];
    }

    public int peek() throws Exception {
        if (isEmpty()){
            throw new Exception("Cannot peek on an empty stack");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1; //ptr is at last index
    }

    public boolean isEmpty() {
        return ptr == -1;
    }


    

}
