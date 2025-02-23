package DSA_in_Java.Practice.Two_Pointers;

public class Binary_SubArrays_With_Sum {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        return count_subarrays_less_or_equals_goal(nums,goal) - count_subarrays_less_or_equals_goal(nums,goal-1);
    }
    public static int count_subarrays_less_or_equals_goal(int[] nums , int goal){
        if (goal < 0) return 0; //ADD THIS EDGE CASE BECAUSE IF A QUES WILL ASK TO FIND THE GOAL = 0 THEN WE WOULD ALSO HAVE TO CALC THE GOAL WITH -1

        int curr_sum = 0 , count = 0;
        int l = 0 , r = 0;

        while (r < nums.length){
            curr_sum += nums[r];

            while (curr_sum > goal){
                curr_sum -= nums[l];
                l++;
            }
            count += r-l+1;
            r++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numSubarraysWithSum(new int[]{1,0,1,0,1} ,2));
        System.out.println(numSubarraysWithSum(new int[]{0,0,0,0,0} ,0));
        System.out.println(numSubarraysWithSum(new int[]{0} , 0 ));
        System.out.println(numSubarraysWithSum(new int[]{1} ,1 ));
        System.out.println(numSubarraysWithSum(new int[]{1,1,1,1} ,5 ));
        System.out.println(numSubarraysWithSum(new int[]{1,0,1,1,0,1,0,0,1,1,0,1,1,1,0,0,1} ,3 ));
        System.out.println(numSubarraysWithSum(new int[]{1,0,1,0,1,0,1,0,1,0,1} ,2 ));
    }
}
