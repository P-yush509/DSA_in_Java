package DSA_in_Java.Practice.Arrays.L2Medium;

import java.util.HashMap;

public class Count_Bad_Pairs {
    public static long countBadPairs(int[] nums) {
        //count of bad pairs = all pairs - good pairs;
        //for good pairs (nums[i]-i==nums[j]-j)
        //hence we'll keep track of difference = nums[i]-i , if any difference comes more than once then it will create a good pair.
        HashMap<Integer,Integer> map = new HashMap<>();
        long goodCount = 0;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            int diff = nums[i] - i;
            int prevCount = map.getOrDefault(diff , 0);
            goodCount += prevCount;     // if a diff repeats more than twice means it will make more than 1 pair than in that case count the diff's previous occurrence and add it to your goodCount.
            map.put(diff,map.getOrDefault(diff,0)+1);
        }

        long totalCount = (long) n*(n-1)/2 ;
        return totalCount - goodCount;
    }

    public static void main(String[] args) {
        System.out.println(countBadPairs(new int[] {4,1,3,3}));
        System.out.println(countBadPairs(new int[] {1,2,3,4,5}));
    }
}
