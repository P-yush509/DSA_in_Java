package DSA_in_Java.Practice.Arrays.L2Medium;

import java.util.Arrays;

public class Rearrange_by_sign {
    public static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int pos_ptr = 0;
        int neg_ptr = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0){
                ans[pos_ptr]=nums[i];
                pos_ptr = pos_ptr + 2;
            }else {
                ans[neg_ptr]=nums[i];
                neg_ptr = neg_ptr + 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] nums = {3, 1, -2, -5, 2, -4};
        int [] nums2 = {-1,1};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
        System.out.println(Arrays.toString(rearrangeArray(nums2)));
        
    }
}
