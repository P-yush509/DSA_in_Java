package DSA_in_Java.Queue.Custom_queue;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public void insert(int item) {
        if (isFull()){
            //create a new array of double the size
            int [] temp = new int[data.length * 2];

            // copy all items to the new one
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;  //as data array is full
            data=temp;
        }
        super.insert(item);
    }
}
