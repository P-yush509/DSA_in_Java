package DSA_in_Java.Practice.Linked_List.OneD;

public class LLforGFG {
    static class Node {
        int data;
        Node next;

        Node() { data = 0; }
        Node(int d) { data = d; }  //constructor to create a new node
    }
    static void printLL(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }
     static Node constructLL(int []arr) {
        if(arr.length==0){
            return null;
        }
        Node head= new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
                temp.next=newNode;
                temp=temp.next;
            }
        return head;
    }

    static Node insertAtEnd(Node head, int x) {
        if(head==null){
            return new Node(x);
        }
        Node temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        Node tempNode = new Node(x);
        temp.next=tempNode;
        return head;
    }
    public static int getCount(Node head) {
        Node temp = head;
        int count = 0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    static boolean searchKey(int n, Node head, int key) {
        Node temp = head;
        while (temp!=null){
            if (temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printLL(insertAtEnd(constructLL(arr),6));
        int[] arr2 = {};
        printLL(constructLL(arr2));
    }
}
