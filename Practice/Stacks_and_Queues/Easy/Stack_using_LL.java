package DSA_in_Java.Practice.Stacks_and_Queues.Easy;

public class Stack_using_LL {
     class StackNode {
         int data;
         StackNode next;
         StackNode(int a) {
             data = a;
             next = null;
         }
     }
    StackNode top;          //head of LL

    void push(int a) {
        StackNode temp = new StackNode(a);
        if (top==null){
            top=temp;
        }else {
            StackNode ptr = top;
            while (ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next=temp;
        }
    }

    int pop() {
        if (top==null)  return -1;
        if (top.next==null)    {
            int popped = top.data;
            top = null;
            return popped;
        }
        StackNode ptr = top;
        while (ptr.next.next!=null){
            ptr = ptr.next;
        }
        int popped = ptr.next.data;
        ptr.next = null;
        return popped;
    }

    public static void main(String[] args) {
        Stack_using_LL s1 = new Stack_using_LL();
        s1.push(2);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        s1.push(3);
        s1.push(4);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
    }
}
