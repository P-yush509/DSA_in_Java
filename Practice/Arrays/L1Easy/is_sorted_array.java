package DSA_in_Java.Practice.Arrays.L1Easy;

public class is_sorted_array {
//    public static boolean check(int[] nums) {
//        int min_value_index = 0;
//        int i=1;
//        while (i< nums.length){
//            if(nums[min_value_index]>nums[i]){
//                min_value_index=i;
//            }
//            i++;
//        }
//        for (int j=min_value_index;j< nums.length-1;j++){
//            if (!(nums[j]<=nums[j+1])){
//                return false;
//            }
//        }
//        for (int j = 0; j < min_value_index-1; j++) {
//            if (!(nums[j]<=nums[j+1])){
//                return false;
//            }
//        }
//        for (int j = 0; j <= min_value_index-1; j++) {
//            if (!(nums[j]>=nums[nums.length-1])){
//                return false;
//            }
//        }
//        return true;
//    }

    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int []nums ={3,4,5,1,2};
        int []nums2 ={2,1,3,4};
        int []nums3 ={1,2,3};
        int []nums4 ={1,1,2,3,3};
        int []nums5 ={6,10,6};

        System.out.println(check(nums));
        System.out.println(check(nums2));
        System.out.println(check(nums3));
        System.out.println(check(nums4));
        System.out.println(check(nums5));
    }
}
