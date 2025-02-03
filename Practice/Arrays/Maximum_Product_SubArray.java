package DSA_in_Java.Practice.Arrays;

public class Maximum_Product_SubArray {
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int prefixProduct = 1;
        int sufixProduct = 1;
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (prefixProduct==0) prefixProduct=1;
            if (sufixProduct==0) sufixProduct=1;

            prefixProduct *= nums[i];
            sufixProduct *= nums[n-i-1];
            result=Math.max(result,Math.max(prefixProduct,sufixProduct));
        }
        return result;
    }



    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        int[] nums2 = {-2,0,-1};
        int[] nums3 = {-2,0,4,9};
        int[] nums4 = {-2,0,4,9,-8,7,-8};
        int[] nums5 = {-2};
        int[] nums6 = {3,-1,4};
        System.out.println(maxProduct(nums));
        System.out.println(maxProduct(nums2));
        System.out.println(maxProduct(nums3));
        System.out.println(maxProduct(nums4));
        System.out.println(maxProduct(nums5));
        System.out.println(maxProduct(nums6));
    }
}
