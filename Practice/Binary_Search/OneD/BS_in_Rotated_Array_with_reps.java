package DSA_in_Java.Practice.Binary_Search.OneD;

public class BS_in_Rotated_Array_with_reps {
    public static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (nums[mid]==target){
                return true;
            } else if (nums[start]==nums[mid] && nums[mid]==nums[end]) {
                start++;
                end--;
                continue;
            } else if (nums[start]<=nums[mid]){ //left half is sorted
                if (nums[start]<=target && target<=nums[mid]){//target lies btwn start and mid
                    end=mid-1;
                }else {//target lies btwn mid and end
                    start=mid+1;
                }
            }else {//right half is sorted
                if (nums[mid]<=target && target<=nums[end]){//target lies btwn mid and end
                    start=mid+1;
                }else {//target lies btwn start and mid
                    end=mid-1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        int target1 = 0;
        int target2 = 3;
        System.out.println(search(nums,target1));
        System.out.println(search(nums,target2));
        int[] nums2 = {1,0,1,1,1};
        int target3 = 0;
        System.out.println(search(nums2,target3));

    }
}
