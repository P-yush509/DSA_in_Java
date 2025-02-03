package DSA_in_Java.Practice.Linked_List.OneD;

import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.ListNode;
import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.constructLL;

public class Middle_node {
    public static ListNode middleNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        ListNode head = constructLL(arr);
        System.out.println(middleNode(head).val);
        int [] arr2 = {1,2,3,4,5,6};
        ListNode head2 = constructLL(arr2);
        System.out.println(middleNode(head2).val);
    }
}
