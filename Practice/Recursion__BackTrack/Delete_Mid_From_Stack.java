package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.Stack;

public class Delete_Mid_From_Stack {
    public static void deleteMid(Stack<Integer> s) {
        int count = 1;
        int indexOfelementToDelete;
        int stackSize = s.size();
        if(stackSize % 2 == 0){
            indexOfelementToDelete = ((stackSize+1)/2)+1;
        }else{
            indexOfelementToDelete = (stackSize+1)/2; 
        }
        deleteMidHelper(s,count,indexOfelementToDelete);
    }

    public static Stack<Integer> deleteMidHelper(Stack<Integer> s, int count , int indexOfelementToDelete) {
        if(count == indexOfelementToDelete){
            s.pop();
            return s;
        }

        int value = s.pop();
        deleteMidHelper(s,++count,indexOfelementToDelete);

        s.push(value);
        return s;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        deleteMid(stack);
        System.out.println(stack);

        String str = "abc";
    }
}
