package DSA_in_Java.Practice.Stacks_and_Queues.Monotonic_Stack;

import java.util.Stack;

public class Largest_Rectangle_in_Histogram {
//    public static int largestRectangleArea(int[] heights) {
//        int n = heights.length;
//        if (n==0) return 0;
//        int max_volume = Integer.MIN_VALUE;
//        for (int i = 0; i < n; i++) {
//            int count =  1;
//            int right_index = i;
//            int left_index = i;
//            while (right_index < n-1 && heights[right_index+1]>=heights[right_index]){
//                count++;
//                right_index++;
//            }
//            while (left_index > 0 && heights[left_index-1]>=heights[left_index]){
//                count++;
//                left_index--;
//            }
//            max_volume = Math.max(max_volume,heights[i]*count);
//        }
//        return max_volume;
//    }

    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max_vol = 0;
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                int curr_height_idx = stack.pop();
                int index_of_nse = i;
                int index_of_pse = !stack.isEmpty() ? stack.peek() : -1;
                int curr_vol = heights[curr_height_idx] * (index_of_nse - index_of_pse -1);
                max_vol = Math.max(max_vol , curr_vol);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            int curr_height_idx = stack.pop();
            int index_of_nse = heights.length;
            int index_of_pse = !stack.isEmpty() ? stack.peek() : -1;
            int curr_vol = heights[curr_height_idx] * (index_of_nse - index_of_pse -1);    // taken hypothetical "nse" as nth height;
            max_vol = Math.max(max_vol , curr_vol);
        }
        return max_vol;
    }

        public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[] {3,2,10,11,5,10,6,3}));
        System.out.println(largestRectangleArea(new int[] {2,1,5,6,2,3}));
        System.out.println(largestRectangleArea(new int[] {2,4}));
        System.out.println(largestRectangleArea(new int[] {5}));
        System.out.println(largestRectangleArea(new int[] {1,2,3,4,5}));
        System.out.println(largestRectangleArea(new int[] {5,4,3,2,1}));
        System.out.println(largestRectangleArea(new int[] {3,3,3,3,3}));
        System.out.println(largestRectangleArea(new int[] {2,1,2}));
        System.out.println(largestRectangleArea(new int[] {1000,1000,1000,1000,1000,1000,1000,1000,1000,1000}));
        System.out.println(largestRectangleArea(new int[] {2,1,4,5,1,3,3}));
        System.out.println(largestRectangleArea(new int[] {}));
        System.out.println(largestRectangleArea(new int[] {0,0,0,0}));
    }
}
