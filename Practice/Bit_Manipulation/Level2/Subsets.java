package DSA_in_Java.Practice.Bit_Manipulation.Level2;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int num = 0; num < (1<<nums.length); num++) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if ((num & 1<<i) > 0){
                    subset.add(nums[i]);
                }
            }
            ans.add(subset);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));

        int[] nums2 = {0};
        System.out.println(subsets(nums2));
    }
}
