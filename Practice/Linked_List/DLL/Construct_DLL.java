package DSA_in_Java.Practice.Linked_List.DLL;

public class Construct_DLL {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int x){
            data = x;
            next = null;
            prev = null;
        }
    }

    public static Node constructDLL(int [] arr) {
        if (arr.length==0) return null;
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            temp.next=newNode;
            newNode.prev=temp;
            temp=temp.next;
        }
        return head;
    }

    public static void printDLL(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = constructDLL(arr);
        printDLL(head);

        int[] arr2 = {1 , 2};
        Node head2 = constructDLL(arr2);
        printDLL(head2);
    }
}
