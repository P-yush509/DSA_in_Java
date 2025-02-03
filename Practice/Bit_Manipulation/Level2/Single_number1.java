package DSA_in_Java.Practice.Bit_Manipulation.Level2;

public class Single_number1 {
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums){
            ans ^= num;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));

        int[] nums2 = {2,2,1};
        System.out.println(singleNumber(nums2));

        int[] nums3 = {0};
        System.out.println(singleNumber(nums3));
    }
}
