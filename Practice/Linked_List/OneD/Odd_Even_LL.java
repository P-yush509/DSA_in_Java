package DSA_in_Java.Practice.Linked_List.OneD;

import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.ListNode;
import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.constructLL;
import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.printLL;


public class Odd_Even_LL {
    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next==null || head.next.next== null){
            return head;
        }
        ListNode head1 = head , head2 = head.next;
        ListNode temp1 = head1 , temp2 = head2;
        while (temp1.next != null && temp1.next.next != null){
            temp1.next=temp1.next.next;
            temp1=temp1.next;
            if (temp2.next != null && temp2.next.next != null){
                temp2.next=temp2.next.next;
                temp2=temp2.next;
            }else {
                // End the even list correctly to avoid infinite loops or errors
                temp2.next = null;
                break;
            }
        }
        temp1.next=head2;
        return head1;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2 , 3, 4, 5};
        ListNode head = constructLL(arr);
        printLL(head);
        ListNode newHead1 = oddEvenList(head);
        printLL(newHead1);

        int [] arr2 = {2 , 1, 3, 5, 6, 4, 7};
        ListNode head2 = constructLL(arr2);
        printLL(head2);
        ListNode newHead2 = oddEvenList(head2);
        printLL(newHead2);

        int [] arr3 = {1 , 2 , 3 , 4};
        ListNode head3 = constructLL(arr3);
        printLL(head3);
        ListNode newHead3 = oddEvenList(head3);
        printLL(newHead3);
    }
}
