package DSA_in_Java.Practice.Binary_Search.OneD;

public class Binary_Search {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }else if (nums[mid]>target){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target1 = 9;
        int target2 = 2;
        System.out.println(search(nums,target1));
        System.out.println(search(nums,target2));
        int[] nums2 = {5};
        int target3 = 5;
        System.out.println(search(nums2,target3));

    }
}
