package DSA_in_Java.Practice.Linked_List.OneD;

import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.ListNode;
import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.constructLL;
import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.printLL;

public class Remove_nth_from_end {
//    public static ListNode removeNthFromEnd(ListNode head, int n) {
//        int size = LL_size(head);
//        if (n == size) return head.next;
//        int temp_index = size - n - 1; // temp will remain at 1 index behind the node to be deleted
//        ListNode temp = head;
//        while (temp_index>0){
//            temp=temp.next;
//            temp_index--;
//        }
//        temp.next=temp.next.next;
//        return head;
//    }
//    public static int LL_size(ListNode head){
//        ListNode temp = head;
//        int count = 0;
//        while(temp!=null){
//            count++;
//            temp=temp.next;
//        }
//        return count;
//    }

    public static ListNode removeNthFromEnd(ListNode head, int n){
        if (head.next==null) return null;
        ListNode temp1 = head , temp2 = null;
        while (n>0){
            temp1=temp1.next;
            n--;
        }
        if (temp1==null) return head.next;
        temp2=head;
        while (temp1.next!=null){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        temp2.next=temp2.next.next;
        return head;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2 , 3, 4, 5};
        ListNode head = constructLL(arr);
        printLL(head);
        ListNode newHead1 = removeNthFromEnd(head , 2);
        printLL(newHead1);

        int [] arr2 = {1};
        ListNode head2 = constructLL(arr2);
        printLL(head2);
        ListNode newHead2 = removeNthFromEnd(head2 , 1);
        printLL(newHead2);

        int [] arr3 = {1 , 2};
        ListNode head3 = constructLL(arr3);
        printLL(head3);
        ListNode newHead3 = removeNthFromEnd(head3 ,2);
        printLL(newHead3);
    }
}
