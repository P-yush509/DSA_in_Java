package DSA_in_Java.Practice.Stacks_and_Queues.Monotonic_Stack;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element_2 {
//    public static int[] nextGreaterElements(int[] nums) {
//        int n = nums.length;
//        int[] ansArray = new int[n];
//        for (int i = 0; i < n; i++) {
//            int flag = 0;
//            for (int j = i+1; j < n+i ; j++) {
//                if (nums[i]<nums[j%n]){
//                    ansArray[i]=nums[j%n];
//                    flag = 1;
//                    break;
//                }
//            }
//            if (flag==0){
//                ansArray[i] = -1;
//            }
//        }
//        return ansArray;
//    }

    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] ansArray = new int[n];
        for (int i = 2*n-1; i >= 0 ; i--) {
            int num = nums[i%n];
            if (stack.isEmpty()){
                if (i<n){
                    ansArray[i]=-1;
                }
                stack.push(num);
            } else if (num < stack.peek()) {
                if (i<n){
                    ansArray[i] = stack.peek();
                }
                stack.push(num);
            } else if (num >= stack.peek()) {
                while (!stack.isEmpty() && num >= stack.peek()){
                    stack.pop();
                }
                if (stack.isEmpty() && i < n){
                    ansArray[i]=-1;
                } else if (i < n) {
                    ansArray[i] = stack.peek();
                }
                stack.push(num);
            }
        }
        return ansArray;
    }

        public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));

        int[] nums2 = {1,2,3,4,3};
        System.out.println(Arrays.toString(nextGreaterElements(nums2)));
    }
}
