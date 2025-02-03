package DSA_in_Java.Practice.Stacks_and_Queues.Monotonic_Stack;

public class Trapping_rain_water {
    public static int trap(int[] height) {
        int[] prev_greater_height = prefix_max(height);
        int[] next_greater_height = suffix_max(height);
        int max_water = 0;
        for (int i = 0; i < height.length ; i++) {
            int water = 0;
            if ((prev_greater_height[i] > height[i]) && (height[i] < next_greater_height[i])){
                water = Math.min(prev_greater_height[i],next_greater_height[i]) - height[i];
            }
            max_water += water;
        }
        return max_water;
    }

    public static int[] prefix_max(int[] nums){
        int n = nums.length;
        int[] prefix_max_array = new int[n];
        prefix_max_array[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix_max_array[i] = Math.max(nums[i] , prefix_max_array[i-1]);
        }
        return prefix_max_array;
    }

    public static int[] suffix_max(int[] nums){
        int n = nums.length;
        int[] suffix_max_array = new int[n];
        suffix_max_array[n-1] = nums[n-1];
        for (int i = n-2; i >= 0; i--) {
            suffix_max_array[i] = Math.max(nums[i] , suffix_max_array[i+1]);
        }
        return suffix_max_array;
    }


    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));

        int[] height2 = {4,2,0,3,2,5};
        System.out.println(trap(height2));
    }
}
