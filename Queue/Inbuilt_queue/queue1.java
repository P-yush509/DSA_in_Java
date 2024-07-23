package DSA_in_Java.Queue.Inbuilt_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class queue1 {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
         q1.add(5);
         q1.add(4);
         q1.add(3);
         q1.add(2);
         q1.add(1);

        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());

        Deque <Integer> deque = new ArrayDeque<>();
        //insertion and deletion at both the ends
        // Does not accept null entries
        //Will be useful when will be doing BFS & DFS in trees
    }
}
