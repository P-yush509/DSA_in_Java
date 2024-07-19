package DSA_in_Java.Linked_List.Custom_LL;

public class Main {
    public static void main(String[] args) {
        myLL list1 = new myLL();

        list1.InsertAtFirst(5);
        list1.InsertAtFirst(4);
        list1.InsertAtFirst(3);
        list1.InsertAtFirst(2);
        list1.InsertAtFirst(1);
        list1.display();

        System.out.println("deleted item: "+list1.deleteFromLast());
        list1.display();

        list1.insertionRec(9,2);
        list1.display();

        Node mid = list1.middleNode(list1.head);
        System.out.println("Middle node is "+mid.value);

//        myLL list2 = new myLL();
//        list2.head= mid.next;
//        mid.next=null;
//        list1.display();
//        list2.display();
//        myLL list3 =new myLL();
//        list3.head = list1.mergeTwoSortedLists(list1.head,list2.head);
//        list3.display();

//        System.out.println("List1 before sorting");
//        list1.display();
//        list1.head= list1.sortList(list1.head);
//        System.out.println("List1 after sorting");
//        list1.display();

        System.out.println("LL before reversal");
        list1.display();
        list1.reversal_Rec(list1.head);
        System.out.println("LL after reversal");
        list1.display();

        list1.head = list1.reverse_iter(list1.head);
        list1.display();

        list1.head = list1.reverseBetween(list1.head, 2, 4);
        list1.display();
//
//        myLL tempList = new myLL();
//        tempList.InsertAtFirst(1);
//        tempList.InsertAtFirst(2);
//        tempList.InsertAtFirst(2);
//        tempList.InsertAtFirst(1);
////        tempList.InsertAtFirst(2);
////        tempList.InsertAtFirst(7);
////        tempList.InsertAtFirst(7);
////        tempList.InsertAtFirst(3);
////        tempList.InsertAtFirst(1);
//        tempList.display();
//        System.out.println(tempList.middleNode(tempList.head).value);
//        System.out.println(tempList.isPalindrome(tempList.head));

//        myLL tempList = new myLL();
//        tempList.InsertAtFirst(5);
//        tempList.InsertAtFirst(4);
//        tempList.InsertAtFirst(3);
//        tempList.InsertAtFirst(2);
//        tempList.InsertAtFirst(1);
//        tempList.display();
//        tempList.reorderList(tempList.head);
//        tempList.display();

//        myLL tempList = new myLL();
//        tempList.InsertAtFirst(8);
//        tempList.InsertAtFirst(7);
//        tempList.InsertAtFirst(6);
//        tempList.InsertAtFirst(5);
//        tempList.InsertAtFirst(4);
//        tempList.InsertAtFirst(3);
//        tempList.InsertAtFirst(2);
//        tempList.InsertAtFirst(1);
//        tempList.display();
//        tempList.head = tempList.reverseKGroup(tempList.head, 3);
//        tempList.display();

        myLL tempList = new myLL();
//        tempList.InsertAtFirst(5);
//        tempList.InsertAtFirst(4);
//        tempList.InsertAtFirst(3);
        tempList.InsertAtFirst(2);
        tempList.InsertAtFirst(1);
        tempList.InsertAtFirst(0);
        tempList.display();
        tempList.head = tempList.rotateRight2(tempList.head, 4);
        tempList.display();
    }
}
