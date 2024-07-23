package DSA_in_Java.Queue.Custom_queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(5);
        queue.insert(4);
        queue.insert(3);
        queue.insert(2);
        queue.insert(1);

        queue.display();

        System.out.println(queue.remove());
//        queue.insert(9);
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        queue.display();

    }
}
