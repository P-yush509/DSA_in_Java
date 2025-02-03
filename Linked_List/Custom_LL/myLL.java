package DSA_in_Java.Linked_List.Custom_LL;

class Node{
         int data;
         Node next;

        public Node(int value){
            this.data =value;
        }
        public Node(int value , Node next){
            this.data =value;
            this.next=next;
        }
}

public class myLL {
    Node head;
    Node tail;
    int size;

    public myLL() {
        this.size = 0;
    }

    public void InsertAtFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int deleteFromLast() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int deleted = temp.next.data;
        temp.next = null;
        tail = temp;
        return deleted;
    }

    public void insertionRec(int val, int index) {
        head = insertionRec(val, index, head);
    }

    public Node insertionRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
//        changes
        node.next = insertionRec(val, index - 1, node.next);
        return node;
    }

    //MIDDLE OF LL
    Node middleNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next; // Start fast one step ahead

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // MERGE 2 LLs
    Node mergeTwoSortedLists(Node list1, Node list2) {
        if (list1 == null && list2 == null) {
            return list1;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        Node temp1 = list1;
        //changed
        Node temp2 = list2;
        Node list3;
        if (list1.data <= list2.data) {
            list3 = list1;
            temp1 = temp1.next;
        } else {
            list3 = list2;
            temp2 = temp2.next;
        }
        Node temp3 = list3;
        while (temp1 != null && temp2 != null) {
            if (temp1.data <= temp2.data) {
                temp3.next = temp1;
                temp1 = temp1.next;
            } else {
                temp3.next = temp2;
                temp2 = temp2.next;
            }
            temp3 = temp3.next;
        }
        if (temp1 == null) {
            temp3.next = temp2;
        } else if (temp2 == null) {
            temp3.next = temp1;
        }
        return list3;
    }

    //MERGE SORT
    Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // Find the middle of the list
        Node mid = middleNode(head);
        Node left = head;
        Node right = mid.next;
        mid.next = null; // Split the list into two halves
        // Recursively sort both halves
        left = sortList(left);
        right = sortList(right);
        // Merge the two sorted halves
        return mergeTwoSortedLists(left, right);
    }

    // RECURSIVE REVERSAL OF LL
    void reversal_Rec(Node node) {
        if (node == null) {
            head = tail;
            return;
        }
        reversal_Rec(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    //ITERATIVE REVERSAL OF LL
    Node reverse_iter(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node prev = null;
        Node pres = head;
        Node nxt =  pres.next;

        while (pres!= null){
            pres.next=prev;
            prev=pres;
            pres=nxt;
            if(nxt!=null){
                nxt=pres.next;
            }
        }
        head=prev;
        return head;
    }

    // PARTIAL REVERSAL OF LL
    public Node reverseBetween(Node head, int left, int right) {
        if(head==null || head.next==null || left == right){
            return head;
        }
        Node prev = null;
        Node curr = head;
        int i = 1 ;
        while(curr!=null && i!=left){
            prev=curr;
            curr=curr.next;
            i++;
        }
        Node ptrToStart = prev;
        Node start = curr;
        prev=null;

        while (curr!=null && i!=right+1){
            Node nxt  = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
            i++;
        }
        start.next=curr;
        if(ptrToStart!=null){
            ptrToStart.next=prev;
        }else {
            return prev;
        }
        return head;
    }

    //IS LL PALINDROME
    boolean isPalindrome(Node head) {
        if(head==null){
            return false;
        } else if (head.next==null) {
            return true;
        }
        Node mid = middleNode(head);
        Node head2 = mid.next;
        mid.next=null;
        head2 = reverse_iter(head2);

        Node temp1 = head;
        Node temp2 = head2;

        boolean flag = true;
        while (temp1!=null && temp2!=null){
            if (temp1.data !=temp2.data){
                flag=false;
                break;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return flag;
    }

    //REORDER GIVEN LL
    void reorderList(Node head) {
        if(head==null || head.next==null){
            return;
        }
        Node mid = middleNode(head);
        Node head2 = mid.next;
        mid.next=null;
        head2 = reverse_iter(head2);

        Node temp1 = head;
        Node temp2 = head2;
        Node temp ;

        while(temp1!=null && temp2!=null){
            temp=temp1.next;
            temp1.next=temp2;
            temp1=temp;
            temp=temp2.next;
            temp2.next=temp1;
            temp2=temp;
        }
    }

    //REVERSE K GROUPS OF LL
    Node reverseKGroup( Node head, int k) {
        if (head == null) return null;
        Node curr = head, prev = null, next = null;
         int c = k;
        // First pass: Reverse the first k nodes
        while (curr != null && c > 0) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            c--;
        }
        // If the number of nodes is less than k, we need to reverse them back
        if (curr == null && c > 0) {
            curr = prev;
            prev = null;
            next = null;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
        }
        // If there are more nodes to process, recursively call the function
        if (c > 0) {
            return prev;
        } else {
            head.next = reverseKGroup(curr, k);
        }
        return prev;
    }
    
    //ROTATE LL TO RIGHT BY K TIMES
    // (HIGH TIME COMPLEXITY)
    Node rotateRight(Node head,int k) {
        if(head==null || head.next==null){
            return head;
        }
        while (k!=0){
            Node first = head.next;
            Node second = head;
            while (first.next!=null){
                first=first.next;
                second = second.next;
            }
            first.next=head;
            second.next=null;
            head=first;
            k--;
        }
        return head;
    }
    Node rotateRight2(Node head,int k){
        Node temp1 = head;
        int len = 1;
        while (temp1.next!=null){
            len++;
            temp1=temp1.next;
        }
        k = k % len;
        Node temp2 = head;
        for (int i = 1; i < len-k ; i++) {
                temp2=temp2.next;
        }
        temp1.next=head;
        head=temp2.next;
        temp2.next=null;
        return head;
    }
}
