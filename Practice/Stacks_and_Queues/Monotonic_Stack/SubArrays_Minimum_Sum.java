package DSA_in_Java.Practice.Stacks_and_Queues.Monotonic_Stack;

import java.util.Arrays;
import java.util.Stack;

public class SubArrays_Minimum_Sum {
    public static int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long sum = 0;
        int mod = 1000000007;
        int[] pre_smaller_index_array = prev_Smaller_idx_func(arr);
        int[] next_smaller_index_array = next_Smaller_idx_func(arr);
        for (int i = 0; i < n; i++) {
            int prev_smaller_index = pre_smaller_index_array[i];
            int next_smaller_index = next_smaller_index_array[i];
            int no_of_elements_in_left = i - prev_smaller_index;
            int no_of_elements_in_right = next_smaller_index - i;
            int product = (no_of_elements_in_left * no_of_elements_in_right) % mod;
            product = (product * arr[i]) % mod;
            sum = ((sum % mod) + product) % mod;
        }
        return (int)sum;
    }

    public static int[] prev_Smaller_idx_func(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();   // Stack stores indices
        int[] pre_smaller_index_array = new int[n];
        for (int i = 0; i < n ; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                pre_smaller_index_array[i] = -1;
            } else {
                pre_smaller_index_array[i] = stack.peek();
            }
            stack.push(i);
        }
        return pre_smaller_index_array;
    }

    public static int[] next_Smaller_idx_func(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>(); // Stack stores indices
        int[] next_smaller_index_array = new int[n];
        for (int i = n-1; i >= 0 ; i--) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                next_smaller_index_array[i] = n;
            } else {
                next_smaller_index_array[i] = stack.peek();
            }
            stack.push(i);
        }
        return next_smaller_index_array;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(sumSubarrayMins(nums));

        int[] nums2 = {11,81,94,43,3};
        System.out.println(sumSubarrayMins(nums2));

        int[] nums3 = {19,19,62,66};
        System.out.println(Arrays.toString(prev_Smaller_idx_func(nums3)));
        System.out.println(Arrays.toString(next_Smaller_idx_func(nums3)));
        System.out.println(sumSubarrayMins(nums3));
    }
}
