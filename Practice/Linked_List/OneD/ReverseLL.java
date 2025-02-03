package DSA_in_Java.Practice.Linked_List.OneD;

import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.ListNode;
import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.printLL;
import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.constructLL;

public class ReverseLL {
    public static ListNode reverseList(ListNode head){
        if(head==null || head.next==null) return head;

        ListNode first = head.next;
        ListNode second = head;
        ListNode third = null;
        while (first!=null || second!=null){
            second.next=third;
            third=second;
            second=first;
            if(first!=null) first=first.next;
        }
        return third;
    }

    public static ListNode rec_ReverseList(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode newHead = rec_ReverseList(head.next);
        ListNode front = head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }

    public static void main(String[] args) {
        int [] arr = {4,5,1,9};
        ListNode head = constructLL(arr);
        printLL(head);
        printLL(reverseList(head));

        int [] arr2 = {1,2,3,4,5};
        ListNode head2 = constructLL(arr2);
        printLL(head2);
        printLL(rec_ReverseList(head2));

        int [] arr3 = {1};
        ListNode head3 = constructLL(arr3);
        printLL(head3);
        printLL(reverseList(head3));

        int [] arr4 = {1,4};
        ListNode head4 = constructLL(arr4);
        printLL(head4);
        printLL(rec_ReverseList(head4));
    }
}
