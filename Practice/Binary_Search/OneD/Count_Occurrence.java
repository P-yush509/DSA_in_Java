package DSA_in_Java.Practice.Binary_Search.OneD;

public class Count_Occurrence {
    public static int count(int[] arr, int n, int x) {
        int[] Range = new int[2];
        Range[0]=search(arr , x , true);
        Range[1]=search(arr , x , false);
        if(Range[0]==-1 || Range[1]==-1){
            return 0;
        }
        return Range[1]-Range[0]+1;
    }

    private static int search(int[] nums, int target, boolean startingIndex) {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (nums[mid]>target){
                end = mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                ans = mid;
                if(startingIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int n = 7;
        int x1 = 2;
        int x2 = 4;
        System.out.println(count(arr,n,x1));
        System.out.println(count(arr,n,x2));
    }
}
