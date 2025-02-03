package DSA_in_Java.Practice.Linked_List.OneD;

public class delete_Node {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode constructLL(int []arr) {
        if(arr.length==0){
            return null;
        }
        ListNode head= new ListNode(arr[0]);
        ListNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode newNode = new ListNode(arr[i]);
            temp.next=newNode;
            temp=temp.next;
        }
        return head;
    }
    public static void printLL(ListNode head){
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public static void deleteNode(ListNode node) {
        if(node==null) return;
        ListNode temp = null;
        while (node.next!=null){
            temp=node;
            node.val=node.next.val;
            node=node.next;
        }
        temp.next=node.next;
    }

    public static void main(String[] args) {
        int [] arr = {4,5,1,9};
        ListNode head = constructLL(arr);
        deleteNode(head.next);
        printLL(head);
        deleteNode(head.next);
        printLL(head);
    }
}
