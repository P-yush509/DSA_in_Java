package DSA_in_Java.Practice.Arrays;

import java.util.Arrays;

public class Next_Permutation {
    public static void nextPermutation(int[] nums) {
        int index = -1;
        // Step 1: Find the first decreasing element from the right
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // Step 2: If such an element is found, swap it with the next larger element
        if (index != -1) {
            for (int i = nums.length - 1; i > index; i--) {
                if (nums[i] > nums[index]) {
                    swap(nums, i, index);
                    break;
                }
            }
        }

        // Step 3: Reverse the array from index + 1 to the end to get the next permutation
        reverse(nums, index + 1, nums.length - 1);

        // Output the next permutation
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    // Function to reverse elements between two indices
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {3, 2, 1};
        int[] nums3 = {1,1,5};
        nextPermutation(nums1);
        nextPermutation(nums2);
        nextPermutation(nums3);
    }
}
