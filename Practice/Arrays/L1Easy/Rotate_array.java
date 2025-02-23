package DSA_in_Java.Practice.Arrays.L1Easy;

import java.util.Arrays;

public class Rotate_array {
//    public static void rotateKPlaces(int[] nums, int k) {
//        int n=nums.length;
//        if(k>n){
//            k=k%n;
//        }
//        int[] temp = new int[n];
//        int j =0;
//        for (int i = n-k; i < n ; i++) {
//            temp[j]=nums[i];
//            j++;
//        }
//        for (int i = 0; i < n-k; i++) {
//            temp[j]=nums[i];
//            j++;
//        }
//        for (int i = 0; i < n; i++) {
//            nums[i] = temp[i];
//        }
//        System.out.println(Arrays.toString(nums));
//    }

    public static void rotateKPlaces(int[] nums, int k) {
        int n = nums.length;
        if (nums.length<=1){
            System.out.println(Arrays.toString(nums));
            return;
        }
        k=k%n;
        rotate(nums , 0 , n-k-1);
        rotate(nums , n-k ,n-1);
        rotate(nums,0,n-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums , int start , int end){
        while (start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateKPlaces(nums,k);
        int [] nums2 = {-1};
        int k2 = 3;
        rotateKPlaces(nums2,k2);
        int [] nums3 = {-1,0};
        int k3 = 3;
        rotateKPlaces(nums3,k3);
    }
}
