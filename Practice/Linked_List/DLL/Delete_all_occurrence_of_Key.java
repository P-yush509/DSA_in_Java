package DSA_in_Java.Practice.Linked_List.DLL;

import static DSA_in_Java.Practice.Linked_List.DLL.Construct_DLL.Node;
import static DSA_in_Java.Practice.Linked_List.DLL.Construct_DLL.constructDLL;
import static DSA_in_Java.Practice.Linked_List.DLL.Construct_DLL.printDLL;
import static DSA_in_Java.Practice.Linked_List.DLL.Delete_Node.deleteNode;

public class Delete_all_occurrence_of_Key {
    public static Node deleteAllOccurOfX(Node head, int x) {
        Node temp = head;
        int pos = 1;
        while (temp!=null){
            if (temp.data==x){
                temp=temp.next;
                head=deleteNode(head,pos);
            }else {
                temp=temp.next;
                pos++;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,10,8,4,2,5,2};
        int key = 2;
        Node head = constructDLL(arr);
        printDLL(head);
        head = deleteAllOccurOfX(head ,key);
        printDLL(head);

        int[] arr2 = {9,1,3,4,5,1,9,8,4};
        int key2 = 9;
        Node head2 = constructDLL(arr2);
        printDLL(head2);
        head2 = deleteAllOccurOfX(head2 ,key2);
        printDLL(head2);

        int[] arr3 = {9};
        int key3 = 9;
        Node head3 = constructDLL(arr3);
        printDLL(head3);
        head3 = deleteAllOccurOfX(head3 ,key3);
        printDLL(head3);
    }
}
