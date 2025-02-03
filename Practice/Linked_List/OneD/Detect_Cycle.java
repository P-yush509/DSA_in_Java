package DSA_in_Java.Practice.Linked_List.OneD;

//THIS CODE WILL NOT WORK HERE BECAUSE THE CREATELL FUNCN CREATES A LL WITHOUT CYCLE
//ALTHOUGH THE DETECT_CYCLE FUNCN IS CORRECT

import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.ListNode;
import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.constructLL;

public class Detect_Cycle {
    public static boolean hasCycle(ListNode head){
        if (head==null || head.next==null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,0,-4};
        ListNode head = constructLL(nums);
        System.out.println(hasCycle(head));

        int[] nums2 = {1,2};
        ListNode head2 = constructLL(nums2);
        System.out.println(hasCycle(head2));

        int[] nums3 = {1};
        ListNode head3 = constructLL(nums3);
        System.out.println(hasCycle(head3));

    }
}
