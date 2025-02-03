package DSA_in_Java.Practice.Arrays.Easy;

import java.util.Arrays;

public class Move_Zeros {
    public static void moveZeroes(int[] nums) {
        int first = 0;
        while (first < nums.length && nums[first]!=0){
            first++;
        }
        int second = first;
        while (second<nums.length){
            if (nums[second]==0){
                second++;
            }else {
                nums[first]=nums[second];
                nums[second]=0;
                first++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
       int[] nums = {0, 1, 0, 3, 12};
       moveZeroes(nums);
       int[] nums2 = {1};
       moveZeroes(nums2);
    }
}
