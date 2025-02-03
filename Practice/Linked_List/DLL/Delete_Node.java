package DSA_in_Java.Practice.Linked_List.DLL;

import static DSA_in_Java.Practice.Linked_List.DLL.Construct_DLL.Node;
import static DSA_in_Java.Practice.Linked_List.DLL.Construct_DLL.constructDLL;
import static DSA_in_Java.Practice.Linked_List.DLL.Construct_DLL.printDLL;

public class Delete_Node {
    public static Node deleteNode(Node head, int x) {
        if (x==1 && head.next!=null) {
            head.next.prev = null;
            return head.next;
        }else if (x==1){
            return null;
        }
        Node temp = head;
        int no_of_shift = x - 2; // as the temp is already on head and also we want to keep the temp 1 node before the actual pos
        while (no_of_shift>0){
            temp=temp.next;
            no_of_shift--;
        }
        if (temp.next.next!=null)  temp.next.next.prev=temp;
        temp.next.prev=null;
        temp.next=temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5};
        int pos = 3;
        Node head = constructDLL(arr);
        printDLL(head);
        head = deleteNode(head ,pos);
        printDLL(head);

        int[] arr2 = {1 , 5 , 2, 9};
        int pos2 = 1;
        Node head2 = constructDLL(arr2);
        printDLL(head2);
        head2 = deleteNode(head2 ,pos2);
        printDLL(head2);

        int[] arr3 = {2};
        int pos3 = 1;
        Node head3 = constructDLL(arr3);
        printDLL(head3);
        head3 = deleteNode(head3 ,pos3);
        printDLL(head3);
    }
}
