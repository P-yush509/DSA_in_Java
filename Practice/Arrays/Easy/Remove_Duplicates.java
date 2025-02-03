package DSA_in_Java.Practice.Arrays.Easy;

public class Remove_Duplicates {
    public static int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast =1;
        while (fast!= nums.length){
            if(nums[fast]!=nums[slow]){
                slow++;
                nums[slow]=nums[fast];
            }
            fast++;
        }
        return slow+1;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,2};
        int [] nums2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(removeDuplicates(nums2));
    }
}
