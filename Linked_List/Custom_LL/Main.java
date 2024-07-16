package DSA_in_Java.Linked_List.Custom_LL;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        myLL list = new myLL();
        list.InsertAtFirst(5);
        list.InsertAtFirst(4);
        list.InsertAtFirst(3);
        list.InsertAtFirst(2);
        list.InsertAtFirst(1);
        list.display();

        System.out.println("deleted item: "+list.deleteFromLast());
        list.display();
        list.insertionRec(9,2);
        list.display();

    }
}
