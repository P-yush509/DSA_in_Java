package DSA_in_Java.Practice.Arrays.L2Medium;

import java.util.Arrays;

public class Sort_Colors {
    public static void sortColors(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        int[] nums2 = {2,0,1};
        sortColors(nums2);
    }
}
