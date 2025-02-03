package DSA_in_Java.Practice.Binary_Search.OneD;

public class Min_in_Rotated_Array {
    public static int findMin(int[] nums) {
        int start = 0;
        int end =nums.length-1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            // If mid element is greater than the last element, the min must be on the right side
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                // Otherwise, the min is on the left side including mid
                end = mid;
            }
        }

        // After the loop, start == end will point to the minimum element
        return nums[start];
    }

    public static void main(String[] args) {
        int [] nums ={3,4,5,1,2};
        int [] nums2 ={4,5,6,7,0,1,2};
        int [] nums3 ={11,13,15,17};
        int [] nums4 ={2,1};
        int [] nums5 ={1};
        int [] nums6 ={2,3,1};
        int [] nums7 ={2,3,4,5,1};
        System.out.println(findMin(nums));
        System.out.println(findMin(nums2));
        System.out.println(findMin(nums3));
        System.out.println(findMin(nums4));
        System.out.println(findMin(nums5));
        System.out.println(findMin(nums6));
        System.out.println(findMin(nums7));
    }
}
