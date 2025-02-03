package DSA_in_Java.Practice.Linked_List.DLL;

import java.util.ArrayList;
import static DSA_in_Java.Practice.Linked_List.DLL.Construct_DLL.Node;
import static DSA_in_Java.Practice.Linked_List.DLL.Construct_DLL.constructDLL;
import static DSA_in_Java.Practice.Linked_List.DLL.Construct_DLL.printDLL;

public class Pair_sum {
//    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
//        Node second = head;
//        ArrayList<ArrayList<Integer>> ansList = new ArrayList<>();
//        while (second!=null && second.data<target){
//            Node first = second.next;
//            int remainingValue = target-second.data;
//            while (first!=null && first.data<=remainingValue){
//                if (first.data==remainingValue){
//                    ArrayList<Integer> list = new ArrayList<>();
//                    list.add(second.data);
//                    list.add(first.data);
//                    ansList.add(list);
//                }
//                first=first.next;
//            }
//            second=second.next;
//        }
//        return ansList;
//    }

    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
            Node left = head , right = head;
            ArrayList<ArrayList<Integer>> ansList = new ArrayList<>();
            while (right!=null && right.next!=null){
                right=right.next;
            }
            while (left!=null && right!= null && left!=right && left.data<=right.data){
                int sum = left.data + right.data;
                if (sum>target){
                    right=right.prev;
                } else if (sum<target) {
                    left=left.next;
                } else {                //(sum==target)
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(left.data);
                    list.add(right.data);
                    ansList.add(list);
                    left=left.next;
                    right=right.prev;
                }
            }
            return ansList;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,8,9};
        int target = 7;
        Node head = constructDLL(arr);
        printDLL(head);
        System.out.println(findPairsWithGivenSum(target,head));

        int[] arr2 = {1,5,6};
        int target2 = 6;
        Node head2 = constructDLL(arr2);
        printDLL(head2);
        System.out.println(findPairsWithGivenSum(target2,head2));

        int[] arr3 = {1,2,2,2,3,4};
        int target3 = 4;
        Node head3 = constructDLL(arr3);
        printDLL(head3);
        System.out.println(findPairsWithGivenSum(target3,head3));
    }
}
