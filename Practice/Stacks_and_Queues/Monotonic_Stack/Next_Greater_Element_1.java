package DSA_in_Java.Practice.Stacks_and_Queues.Monotonic_Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Next_Greater_Element_1 {
//    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        for (int i = 0; i < nums1.length; i++) {
//            int flag = 0;
//            for (int j = 0; j < nums2.length; j++) {
//                if (nums2[j]==nums1[i]){
//                    for (int k = j+1; k < nums2.length ; k++) {
//                        if (nums2[k] > nums1[i]){
//                            nums1[i] = nums2[k];
//                            flag = 1;
//                            break;
//                        }
//                    }
//                    if (flag==0){
//                        nums1[i]=-1;
//                    }
//                    break;
//                }
//            }
//        }
//        return nums1;
//    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = nums2.length-1; i >=0 ; i--) {
            int num = nums2[i];
            if (stack.isEmpty()){
                map.put(num,-1);
                stack.push(num);
            } else if (stack.peek() <= num) {
                while (!stack.isEmpty() && stack.peek() <= num){
                    stack.pop();
                }
                if (!stack.isEmpty()){
                    map.put(num,stack.peek());
                }else {
                    map.put(num,-1);
                }
                stack.push(num);
            } else if (stack.peek() > num) {
                map.put(num,stack.peek());
                stack.push(num);
            }
        }
        int[] ansArray = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ansArray[i] = map.get(nums1[i]);
        }
        return ansArray;
    }

        public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
        int[] nums3 = {2,4};
        int[] nums4 = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(nums3,nums4)));
    }
}
