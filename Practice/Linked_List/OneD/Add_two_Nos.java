package DSA_in_Java.Practice.Linked_List.OneD;

import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.ListNode;
import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.constructLL;
import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.printLL;

public class Add_two_Nos {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1, temp2 = l2;
        int carry = 0;
        // Process both lists while both nodes are not null
        while (temp1 != null && temp2 != null) {
            int sum_value = temp1.val + temp2.val + carry;

            if (sum_value >= 10) {
                carry = 1;
                sum_value -= 10;
            } else {
                carry = 0;
            }
            //updating values in both the lists so that the longer one will be returned and we need not to use extra space for nodes
            temp1.val = sum_value;
            temp2.val = sum_value;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        // Continue with the remaining nodes in the longer list
        ListNode remaining = (temp1 != null) ? temp1 : temp2; // finding the longer LL

        while (remaining != null) {
            int sum_value = remaining.val + carry;
            if (sum_value >= 10) {
                carry = 1;
                sum_value -= 10;
            } else {
                carry = 0;
            }
            remaining.val = sum_value;
            remaining = remaining.next;
        }

        // If there is still a carry left, add it as a new node
        if (carry > 0) {
            ListNode end = (temp1 == null) ? l2 : l1;  //as the "remaining" pointer is pointing to null hence finding the larger LL again
            while (end.next != null) {
                end = end.next;
            }
            end.next = new ListNode(1);
        }

        // Return the head of longer LL
        return (temp1 == null) ? l2 : l1;
    }


    public static void main(String[] args) {
        int [] arr = {2 , 4 , 3};
        int [] arr2 = {5 , 6 , 4};
        ListNode head = constructLL(arr);
        ListNode head2 = constructLL(arr2);
        printLL(head);
        printLL(head2);
        printLL(addTwoNumbers(head , head2));

        int [] arr3 = {0};
        int [] arr4 = {0};
        ListNode head3 = constructLL(arr3);
        ListNode head4 = constructLL(arr4);
        printLL(head3);
        printLL(head4);
        printLL(addTwoNumbers(head3 , head4));

        int [] arr5 = {9, 9, 9, 9, 9, 9 , 9};
        int [] arr6 = {9 , 9 , 9, 9};
        ListNode head5 = constructLL(arr5);
        ListNode head6 = constructLL(arr6);
        printLL(head5);
        printLL(head6);
        printLL(addTwoNumbers(head5 , head6));

    }
}
