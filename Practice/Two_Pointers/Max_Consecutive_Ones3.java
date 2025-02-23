package DSA_in_Java.Practice.Two_Pointers;

import java.util.Arrays;

public class Max_Consecutive_Ones3 {
    public static int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int starting_index = 0 , ending_index = 0;
        int max_length = 0 , curr_length = 0;
        while (ending_index < n){
            if (nums[ending_index]==1){
                curr_length++;
                ending_index++;
            }else if (nums[ending_index]==0 && k!=0){
                curr_length++;
                ending_index++;
                k--;
            } else if (nums[ending_index] == 0 && k == 0) {
                if (nums[starting_index]==0){
                    k++;
                }
                starting_index++;
                curr_length--;
            }
            max_length = Math.max(curr_length,max_length);
        }
        return max_length;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        System.out.println(longestOnes(nums,k));

        int[] nums2 = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k2 = 3;
        System.out.println(longestOnes(nums2,k2));

        int[] nums3 = {1,1,1,1,1};
        int k3 = 2;
        System.out.println(longestOnes(nums3,k3));

        int[] nums4 = {0,0,0,0,0};
        int k4 = 2;
        System.out.println(longestOnes(nums4,k4));

        int[] nums5 = {1,0,1,0,1,0,1,0,1};
        int k5 = 1;
        System.out.println(longestOnes(nums5,k5));

        int[] nums6 = {1,0,1,1,0,1,0,1,1,1,0,0,1,1};
        int k6 = 3;
        System.out.println(longestOnes(nums6,k6));

        int[] nums7 = new int[100000];
        Arrays.fill(nums7, 1);
        int k7 = 100000;
        System.out.println(longestOnes(nums7,k7));

        int[] nums8 = new int[100000];
        Arrays.fill(nums8, 0);
        int k8 = 50000;
        System.out.println(longestOnes(nums8,k8));
    }
}
