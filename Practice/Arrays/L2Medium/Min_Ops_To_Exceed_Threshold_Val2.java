package DSA_in_Java.Practice.Arrays.L2Medium;

import java.util.PriorityQueue;

public class Min_Ops_To_Exceed_Threshold_Val2 {
    public static int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int count = 0;
        for(int num : nums){
            pq.add((long) num);
        }
        while(pq.size()>=2 && pq.peek()<k){
            long smallestNo = pq.poll();
            long secSmallestNo = pq.poll();
            long newNo = (Math.min(smallestNo,secSmallestNo)*2) + Math.max(smallestNo,secSmallestNo);
            pq.add(newNo);
            count++;
        }
        return (pq.peek()>=k) ? count : -1;
    }

    public static void main(String[] args) {
        System.out.println(minOperations(new int[] {2,11,10,1,3} , 10));
        System.out.println(minOperations(new int[] {1,1,2,4,9} , 20));
        System.out.println(minOperations(new int[] {25} , 10));
        System.out.println(minOperations(new int[] {5,5,5,5} , 50));
        System.out.println(minOperations(new int[] {100,200,300} , 1000));
        System.out.println(minOperations(new int[] {10,20,30} , 5));
        System.out.println(minOperations(new int[] {1,2,3} , 100));
        System.out.println(minOperations(new int[] {999999999,999999999,999999999} , 1000000000));
    }
}
