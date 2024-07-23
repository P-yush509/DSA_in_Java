package DSA_in_Java.Stack.Custom_Stack;

public class DynamcStack extends CustomStack{

    DynamcStack(){
        super();        //it will call the constructor with no argument i.e. CustomStack()
    }

    DynamcStack(int item){
        super(item);        //it will call the constructor with one argument i.e. CustomStack(item)
    }

    @Override
    public void push(int item) {
        if (isFull()){
            //create a new array of double the size
            int [] temp = new int[data.length * 2];

            // copy all items to the new one
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            data=temp;
        }
        ptr++;
        data[ptr] = item;
    }

}
