package DSA_in_Java.Practice.Arrays;

import java.util.Arrays;

public class Longest_Consecutive_Sequence {
    public static int longestConsecutive(int [] nums){
        int n = nums.length;
        if (n==0){
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int maxCount = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i]==nums[i-1]){
                continue;
            }else if (nums[i]==nums[i-1]+1){
                count++;
            }else {
                count=1;
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));

        int[] nums2 = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums2));

        int[] nums3 = {1,2,0,1};
        System.out.println(longestConsecutive(nums3));
    }
}
