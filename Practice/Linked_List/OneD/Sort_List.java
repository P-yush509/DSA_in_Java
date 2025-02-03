package DSA_in_Java.Practice.Linked_List.OneD;

import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.ListNode;
import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.constructLL;
import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.printLL;

public class Sort_List {
    public static ListNode sortList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid = findMiddle(head);
        ListNode leftHead = head;
        ListNode rightHead = mid.next;
        mid.next=null;
        leftHead = sortList(leftHead);
        rightHead= sortList(rightHead);
        return mergeLists(leftHead , rightHead);
    }

    public static ListNode mergeLists(ListNode leftHead, ListNode rightHead) {
        ListNode leftTemp = leftHead , rightTemp = rightHead , ansTemp=null , ansHead=null;

        // Initialize ansHead and ansTemp with the first node of the merged list
        if (leftTemp != null && rightTemp != null) {
            if (leftTemp.val < rightTemp.val) {
                ansHead = ansTemp = leftTemp;
                leftTemp = leftTemp.next;
            } else {
                ansHead = ansTemp = rightTemp;
                rightTemp = rightTemp.next;
            }
        }

        // Continue merging by selecting the smaller node each time
        while (leftTemp != null && rightTemp != null) {
            if (leftTemp.val < rightTemp.val) {
                ansTemp.next = leftTemp;
                ansTemp = ansTemp.next;
                leftTemp = leftTemp.next;
            } else {
                ansTemp.next = rightTemp;
                ansTemp = ansTemp.next;
                rightTemp = rightTemp.next;
            }
        }

        // Attach any remaining nodes in the left or right list
        if (leftTemp != null) {
            ansTemp.next = leftTemp;
        }
        if (rightTemp != null) {
            ansTemp.next = rightTemp;
        }
        return ansHead;
    }

    public static ListNode findMiddle(ListNode head) {
        ListNode slow = head , fast = head.next;
        while (fast!=null && fast.next!= null){
            fast=fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        int [] arr = {1 , 3 , 4 , 7 , 1 , 2 , 6};
        ListNode head = constructLL(arr);
        printLL(head);
        ListNode newHead1 = sortList(head);
        printLL(newHead1);

        int [] arr2 = {1 , 4 ,  3 , 2};
        ListNode head2 = constructLL(arr2);
        printLL(head2);
        ListNode newHead2 = sortList(head2);
        printLL(newHead2);

        int [] arr3 = {2 ,1};
        ListNode head3 = constructLL(arr3);
        printLL(head3);
        ListNode newHead3 = sortList(head3);
        printLL(newHead3);
    }
}
