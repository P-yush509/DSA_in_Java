package DSA_in_Java.Practice.Linked_List.OneD;

import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.ListNode;
import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.constructLL;
import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.printLL;

public class Delete_MiddleNode {
//    public static ListNode deleteMiddle(ListNode head) {
//        if (head==null || head.next==null) return null;
//        int size = LL_size(head);
//        int temp_pos = (size/2) - 1;
//        ListNode temp = head;
//        while (temp_pos!=0){
//            temp=temp.next;
//            temp_pos--;
//        }
//        temp.next=temp.next.next;
//        return head;
//    }

    public static ListNode deleteMiddle(ListNode head){
        if (head==null || head.next==null) return null;
        if (head.next.next==null) {
            head.next=null;
            return head;
        }
        ListNode fast= head , slow = head , last = head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            last=slow;
            slow=slow.next;
        }
        last.next=last.next.next;
        return head;
    }

    public static int LL_size(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

        public static void main(String[] args) {
        int [] arr = {1 , 3 , 4 , 7 , 1 , 2 , 6};
        ListNode head = constructLL(arr);
        printLL(head);
        ListNode newHead1 = deleteMiddle(head);
        printLL(newHead1);

        int [] arr2 = {1 , 2 , 3 , 4};
        ListNode head2 = constructLL(arr2);
        printLL(head2);
        ListNode newHead2 = deleteMiddle(head2);
        printLL(newHead2);

        int [] arr3 = {2 ,1};
        ListNode head3 = constructLL(arr3);
        printLL(head3);
        ListNode newHead3 = deleteMiddle(head3);
        printLL(newHead3);
    }
}
