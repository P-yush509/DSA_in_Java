package DSA_in_Java.Practice.Linked_List.DLL;

import static DSA_in_Java.Practice.Linked_List.DLL.Construct_DLL.Node;
import static DSA_in_Java.Practice.Linked_List.DLL.Construct_DLL.constructDLL;
import static DSA_in_Java.Practice.Linked_List.DLL.Construct_DLL.printDLL;

public class Reverse_DLL {
    public static Node reverseDLL(Node head) {
        Node first = head.next , second = head , third = null;
        while (first!=null || second!=null){
            second.prev=second.next;
            second.next=third;
            third=second;
            second=first;
            if (first!=null)    first=first.next;
        }
        return third;
    }

    public static void main(String[] args) {
        int[] arr = {2};
        Node head = constructDLL(arr);
        printDLL(head);
        Node revHead = reverseDLL(head);
        printDLL(revHead);

        int[] arr2 = {2,4};
        Node head2 = constructDLL(arr2);
        printDLL(head2);
        Node revHead2 = reverseDLL(head2);
        printDLL(revHead2);

        int[] arr3 = {2,4,5};
        Node head3 = constructDLL(arr3);
        printDLL(head3);
        Node revHead3 = reverseDLL(head3);
        printDLL(revHead3);

        int[] arr4 = {1 , 5 , 2, 9};
        Node head4 = constructDLL(arr4);
        printDLL(head4);
        Node revHead4 = reverseDLL(head4);
        printDLL(revHead4);
    }
}
