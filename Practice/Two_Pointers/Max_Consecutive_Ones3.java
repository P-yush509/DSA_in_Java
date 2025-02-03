package DSA_in_Java.Practice.Two_Pointers;

public class Max_Consecutive_Ones3 {
    public static int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int starting_index = 0;
        int ending_index = 0;
        int max_length = 0;
        while (ending_index < n){
            int num = nums[ending_index];
            int curr_length = 0;
            if (k!=0){
                curr_length++;
                k--;
                continue;
            }else {
                if (nums[starting_index]==0){
                    starting_index++;
                    k++;
                    curr_length--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        System.out.println(longestOnes(nums,k));

        int[] nums2 = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k2 = 3;
        System.out.println(longestOnes(nums2,k2));
    }
}
