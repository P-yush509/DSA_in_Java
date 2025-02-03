package DSA_in_Java.Arrays;

import java.util.Arrays;

public class LeetcodeProblems {
    public static void main(String[] args) {
        int[] nums = {3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums , target)));
    }

    //1.two sum
    static int[] twoSum(int[] nums, int target) {
        if (nums.length<2){
            return null;
        }
        for (int index1 = 0; index1 < nums.length ; index1++) {
            for (int index2 = index1+1; index2 < nums.length; index2++) {
                if (nums[index1]+nums[index2]==target){
                    return (new int[] {index1,index2});
                }
            }
        }
        return null;
    }
}
