package DSA_in_Java.Practice.Binary_Search.OneD;

import java.util.Arrays;

public class First_and_Last_Position {
    public static int[] searchRange(int[] nums, int target) {
        int[] Range = new int[2];
        Range[0]=search(nums , target , true);
        Range[1]=search(nums , target , false);
        return Range;
    }

    private static int search(int[] nums, int target, boolean startingIndex) {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (nums[mid]>target){
                end = mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                ans = mid;
                if(startingIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target1= 8;
        int target2=6;
        System.out.println(Arrays.toString(searchRange(nums, target1)));
        System.out.println(Arrays.toString(searchRange(nums, target2)));
        int[] nums2 = {};
        int target3 = 0;
        System.out.println(Arrays.toString(searchRange(nums2, target3)));

    }

}
