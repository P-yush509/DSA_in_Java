package DSA_in_Java.Practice.Binary_Search.OneD;

public class Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        while (start<=end){
            mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }else if (nums[mid]>target){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;
        System.out.println(searchInsert(nums,target1));
        System.out.println(searchInsert(nums,target2));
        System.out.println(searchInsert(nums,target3));
        
    }
}
