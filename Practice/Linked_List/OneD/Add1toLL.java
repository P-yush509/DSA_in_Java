package DSA_in_Java.Practice.Linked_List.OneD;

import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.ListNode;
import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.constructLL;
import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.printLL;
import static DSA_in_Java.Practice.Linked_List.OneD.ReverseLL.reverseList;

public class Add1toLL {
    public static ListNode addOne(ListNode head) {
        if (head==null) return new ListNode(1);
        head = reverseList(head);
        ListNode temp = head;
        temp.val=(temp.val+1)%10;
        while (temp.val==0 && temp.next!=null){
            temp=temp.next;
            temp.val=(temp.val+1)%10;
        }
        if (temp.val==0) temp.next = new ListNode(1);
        return reverseList(head);
    }

    public static void main(String[] args) {
        int [] arr = {1 , 3 , 9};
        ListNode head = constructLL(arr);
        printLL(head);
        ListNode newHead1 = addOne(head);
        printLL(newHead1);

        int [] arr2 = {9,9,9,9};
        ListNode head2 = constructLL(arr2);
        printLL(head2);
        ListNode newHead2 = addOne(head2);
        printLL(newHead2);

        int [] arr3 = {};
        ListNode head3 = constructLL(arr3);
        printLL(head3);
        ListNode newHead3 = addOne(head3);
        printLL(newHead3);
    }
}
