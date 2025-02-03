package DSA_in_Java.Practice.Binary_Search.OneD;

public class Single_Non_Duplicate {
    public static int singleNonDuplicate(int[] nums) {
        int size = nums.length;
        if(size==1) return nums[0];
        int start = 0;
        int end = size-1;
        if (nums[start]!=nums[start+1]) return nums[start];
        if (nums[end]!=nums[end-1]) return nums[end];

        while (start<end){
            int mid = start+(end-start)/2;
            if (nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }else{
                if (mid%2==1){
                    if (nums[mid]==nums[mid-1]){ // we are on the left side of unique element
                        start=mid+1;
                    }else { // we are on the right side of unique element
                        end=mid;
                    }
                }else {
                    if (nums[mid]==nums[mid+1]){ // we are on the left side of unique element
                        start=mid+1;
                    }else { // we are on the right side of unique element
                        end=mid-1;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
        int [] nums2 = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums2));
    }
}
