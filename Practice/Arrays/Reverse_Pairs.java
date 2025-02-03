package DSA_in_Java.Practice.Arrays;

public class Reverse_Pairs {
    public static int reversePairs(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] > 2 * nums[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,3,1};              //2
        int[] nums2 = {2,4,3,5,1};             //3
        int[] nums3 = {1,2,3,4,5};             //0
        int[] nums4 = {-5,-5};             //0
        System.out.println(reversePairs(nums));
        System.out.println(reversePairs(nums2));
        System.out.println(reversePairs(nums3));
        System.out.println(reversePairs(nums4));
    }
}
