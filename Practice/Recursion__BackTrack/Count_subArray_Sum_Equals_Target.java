package DSA_in_Java.Practice.Recursion__BackTrack;

public class Count_subArray_Sum_Equals_Target {
    public static int perfectSum(int[] nums, int target) {
        return helperPerfectSum(nums, target, 0, 0);
    }
    public static int helperPerfectSum(int[] nums, int target, int currSum, int index) {
        if(currSum > target)    return 0;

        // Base Case: If we reach the end of the array
        if (index == nums.length) {
            return currSum == target ? 1 : 0;
        }
        // Include the current element
        currSum += nums[index];
        int countByIncluding = helperPerfectSum(nums, target, currSum, index + 1);

        // Exclude the current element
        currSum -= nums[index];
        int countByExcluding = helperPerfectSum(nums, target, currSum, index + 1);

        return countByIncluding + countByExcluding;
    }

    public static void main(String[] args) {
        System.out.println(perfectSum(new int[] {5, 2, 3, 10, 6, 8},10));
        System.out.println(perfectSum(new int[] {2, 5, 1, 4, 3},10));
        System.out.println(perfectSum(new int[] {5, 7, 8},3));
        System.out.println(perfectSum(new int[] {35, 2, 8, 22},0));
    }
}
