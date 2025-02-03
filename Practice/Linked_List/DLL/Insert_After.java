package DSA_in_Java.Practice.Linked_List.DLL;

import static DSA_in_Java.Practice.Linked_List.DLL.Construct_DLL.Node;
import static DSA_in_Java.Practice.Linked_List.DLL.Construct_DLL.constructDLL;
import static DSA_in_Java.Practice.Linked_List.DLL.Construct_DLL.printDLL;

public class Insert_After {
    public static Node addNode(Node head, int p, int x) {
        if (head==null) return null;
        Node temp = head;
        while (p!=0){
            temp=temp.next;
            p--;
        }
        Node newNode = new Node(x);
        newNode.next=temp.next;
        temp.next=newNode;
        newNode.prev=temp;
        if (newNode.next!=null) newNode.next.prev=newNode;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5};
        int after = 2;
        int value = 6;
        Node head = constructDLL(arr);
        head = addNode(head , after , value);
        printDLL(head);

        int[] arr2 = {1 , 2 , 3 , 4};
        int after2 = 0;
        int value2 = 44;
        Node head2 = constructDLL(arr2);
        head2 = addNode(head2 , after2 , value2);
        printDLL(head2);

        int[] arr3 = {};
        int after3 = 0;
        int value3 = 44;
        Node head3 = constructDLL(arr3);
        head3 = addNode(head3 , after3 , value3);
        printDLL(head3);
    }
}
