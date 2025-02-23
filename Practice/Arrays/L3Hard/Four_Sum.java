package DSA_in_Java.Practice.Arrays.L3Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four_Sum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> triplet;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for (int j = i+1; j < nums.length; j++){
                if (j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int k = j+1;
                int l = nums.length-1;
                while (k<l){
                    long sum = 0;
                    sum+=nums[i];
                    sum+=nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if (sum>target){
                        l--;
                    } else if (sum<target) {
                        k++;
                    }else {
                        triplet=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        ansList.add(triplet);
                        l--;
                        k++;
                        while (k<l && nums[k]==nums[k-1]) k++;
                        while (k<l && nums[l]==nums[l+1]) l--;
                    }
                }
            }
        }
        return ansList;
    }

    public static void main(String[] args) {
        int []nums = {1,0,-1,0,-2,2};
        int []nums2 = {2,2,2,2,2};
        System.out.println(fourSum(nums,0));
        System.out.println(fourSum(nums2,8));
    }
}
