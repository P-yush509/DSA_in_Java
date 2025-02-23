package DSA_in_Java.Practice.Arrays.L2Medium;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Max_Sum_of_Pair_With_Equal_Digit_Sum {
    public static int maximumSum(int[] nums) {
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        int maxSum = -1;
        // make group of numbers of same digitSum
        for (int num : nums){
            int digitSum = 0;
            int numCopy = num;
            while (numCopy!=0){
                digitSum += numCopy%10;
                numCopy /= 10;
            }

            map.putIfAbsent(digitSum, new PriorityQueue<>(Collections.reverseOrder()));
            map.get(digitSum).add(num);
        }
        // getting the sum of 2 largest value among them
        for (PriorityQueue<Integer> pq : map.values()) {
            if (pq.size() >= 2) {
                int largest = pq.poll();       // pop out largest number
                int secondLargest = pq.poll();
                maxSum = Math.max(maxSum, largest + secondLargest);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maximumSum(new int[] {18,43,36,13,7}));
        System.out.println(maximumSum(new int[] {10,12,19,14}));
        System.out.println(maximumSum(new int[] {4,6,10,6}));
    }
}
