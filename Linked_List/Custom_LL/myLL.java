package DSA_in_Java.Linked_List.Custom_LL;

public class myLL {
    private Node head;
    private Node tail;
    private int size;
    public myLL(){
        this.size=0;
    }

    public void InsertAtFirst(int val){
        Node newNode = new Node(val);
        newNode.next=head;
        head=newNode;
        if (tail==null){
            tail=head;
        }
    }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+ "-->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public int deleteFromLast(){
        Node temp = head;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        int deleted=temp.next.value;
        temp.next=null;
        tail=temp;
        return deleted;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value , Node next){
            this.value=value;
            this.next=next;
        }
    }
    public void insertionRec(int val , int index){
        head= insertionRec(val,index,head);
    }
    public Node insertionRec(int val , int index, Node node){
        if (index==0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next=insertionRec(val,index-1,node.next);
        return node;
    }

}
