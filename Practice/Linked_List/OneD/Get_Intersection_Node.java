package DSA_in_Java.Practice.Linked_List.OneD;

import java.util.HashMap;

import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.ListNode;
import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.constructLL;
import static DSA_in_Java.Practice.Linked_List.OneD.delete_Node.printLL;

public class Get_Intersection_Node {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        ListNode temp1 = headA;
//        while (temp1!=null){
//            ListNode temp2 = headB;
//            while (temp2!=null){
//                if(temp1==temp2){
//                    return temp2;
//                }
//                temp2=temp2.next;
//            }
//            temp1=temp1.next;
//        }
//        return null;
//    }

//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        HashMap<ListNode , Integer> map = new HashMap<>();
//        ListNode temp1 = headA , temp2 = headB;
//        while (temp1!=null){
//            map.put(temp1,1);
//            temp1=temp1.next;
//        }
//        while (temp2!=null){
//            if (map.containsKey(temp2)){
//                return temp2;
//            }else {
//                map.put(temp2,1);
//                temp2=temp2.next;
//            }
//        }
//        return null;
//    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA , temp2 = headB;
        while (temp1!=temp2){
            temp1=temp1.next;// as we are extending both the pointers without checking the 1st node , we are putting the while condition accordingly and the return statement at the end is tackling the condition where there is collision at the start
            temp2=temp2.next;
            if (temp1==temp2) return temp1;
            if (temp1==null) temp1=headB;
            if (temp2==null) temp2=headA;
        }
        return temp1;
    }
        public static void main(String[] args) {

    }
}
