package DSA_in_Java.Practice.Two_Pointers;

public class Count_Nice_SubArrays {
    public static int numberOfSubarrays(int[] nums, int k) {
        return count_subarrays_less_or_equals_kOdds(nums,k) - count_subarrays_less_or_equals_kOdds(nums,k-1);
    }

    public static int count_subarrays_less_or_equals_kOdds(int[] nums , int k){
        if (k < 0) return 0; //ADD THIS EDGE CASE BECAUSE IF A QUES WILL ASK TO FIND THE GOAL = 0 THEN WE WOULD ALSO HAVE TO CALC THE GOAL WITH -1

        int curr_sum = 0 , count = 0;
        int l = 0 , r = 0;

        while (r < nums.length){
            curr_sum += (nums[r]%2);

            while (curr_sum > k){
                curr_sum -= (nums[l]%2);
                l++;
            }
            count += r-l+1;
            r++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSubarrays(new int[]{1,1,2,1,1} ,3));
        System.out.println(numberOfSubarrays(new int[]{2,4,6} ,1));
        System.out.println(numberOfSubarrays(new int[]{2,2,2,1,2,2,1,2,2,2} , 2));
    }
}
