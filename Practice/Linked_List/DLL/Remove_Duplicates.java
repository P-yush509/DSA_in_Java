package DSA_in_Java.Practice.Linked_List.DLL;

import static DSA_in_Java.Practice.Linked_List.DLL.Construct_DLL.Node;
import static DSA_in_Java.Practice.Linked_List.DLL.Construct_DLL.constructDLL;
import static DSA_in_Java.Practice.Linked_List.DLL.Construct_DLL.printDLL;

public class Remove_Duplicates { //in sorted DLL
    public static Node removeDuplicates(Node head){
        if (head==null) return null;
        Node second = head , first = head.next;
        while (second!=null && second.next!=null){
            if (first.data==second.data){
                while (first!=null && first.data==second.data){
                    first=first.next;
                }
                second.next=first;
                if (first!=null) first.prev=second;
            }
             second=first;
            if (first!=null) first=first.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1 , 1 , 1 , 2 , 3 , 4};
        Node head = constructDLL(arr);
        printDLL(head);
        head = removeDuplicates(head);
        printDLL(head);

        int[] arr2 = {1 , 2 , 2 , 3 , 3 , 4 , 4};
        Node head2 = constructDLL(arr2);
        printDLL(head2);
        head2 = removeDuplicates(head2);
        printDLL(head2);

        int[] arr3 = {};
        Node head3 = constructDLL(arr3);
        printDLL(head3);
        head3 = removeDuplicates(head3);
        printDLL(head3);
    }
}
