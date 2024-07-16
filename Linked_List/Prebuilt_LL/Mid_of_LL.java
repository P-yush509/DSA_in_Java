//package DSA_in_Java.Linked_List.Prebuilt_LL;
//
//import DSA_in_Java.Linked_List.Custom_LL.myLL;
//
//import java.util.LinkedList;
//
//public class Mid_of_LL {
//    class Node{
//        private int value;
//        private Node next;
//
//        public Node(int value){
//            this.value=value;
//        }
//        public Node(int value , Node next){
//            this.value=value;
//            this.next=next;
//        }
//    }
//
//
//    public static void main(String[] args) {
//        LinkedList<Integer> L1 = new LinkedList<>();
//
//        L1.add(5);
//        L1.add(9);
//        L1.add(89);
//        L1.add(50);
//        L1.add(87);
//        L1.add(56);
////        Node head = L1;
//        Node mid = middleNode(L1);
//    }
//    static Node middleNode(Node head){
//        if(head==null || head.next==null){
//            return head;
//        }
//        Node slow = head;
//        Node fast = head.next; // Start fast one step ahead
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        return slow;
//    }
//}
