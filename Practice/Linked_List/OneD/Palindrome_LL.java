package DSA_in_Java.Practice.Linked_List.OneD;
import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.ListNode;
import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.constructLL;
import static DSA_in_Java.Practice.Linked_List.OneD.ReverseLL.reverseList;
import static DSA_in_Java.Practice.Linked_List.OneD.Middle_node.middleNode;
public class Palindrome_LL {
    public static boolean isPalindrome(ListNode head){
        if (head.next==null){
            return true;
        }
        if (head.next.next==null){
            if (head.val!=head.next.val){
                return false;
            }else {
                return true;
            }
        }

        ListNode firstEnd = middleNode(head);
        ListNode head2 = firstEnd.next;
        firstEnd.next=null;
        head2 = reverseList(head2);
        ListNode temp1 = head , temp2 = head2;
        while (temp1!=null && temp2!=null){
            if (temp1.val!=temp2.val){
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2 , 2, 1};
        ListNode head = constructLL(nums);
        System.out.println(isPalindrome(head));

        int[] nums2 = {1,2};
        ListNode head2 = constructLL(nums2);
        System.out.println(isPalindrome(head2));

        int[] nums3 = {1 , 2 , 3 , 2 , 1};
        ListNode head3 = constructLL(nums3);
        System.out.println(isPalindrome(head3));
    }
}
