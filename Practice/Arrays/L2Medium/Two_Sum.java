package DSA_in_Java.Practice.Arrays.L2Medium;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
//    public static int[] twoSum(int[] nums, int target) {
//        if (nums.length<2){
//            return null;
//        }
//        for (int index1 = 0; index1 < nums.length ; index1++) {
//            for (int index2 = index1+1; index2 < nums.length; index2++) {
//                if (nums[index1]+nums[index2]==target){
//                    return (new int[] {index1,index2});
//                }
//            }
//        }
//        return null;
//    }

    public static int[] twoSum(int[] nums, int target){
        HashMap <Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int req = target-nums[i];
            if (map.containsKey(req)){
                return new int[]{i,map.get(req)};
            }else {
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
        int [] nums2 = {3,2,4};
        int target2 = 6;
        System.out.println(Arrays.toString(twoSum(nums2,target2)));
        int [] nums3 = {3,3};
        int target3 = 6;
        System.out.println(Arrays.toString(twoSum(nums3,target3)));
    }
}
