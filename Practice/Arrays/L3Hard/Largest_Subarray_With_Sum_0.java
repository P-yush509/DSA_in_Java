package DSA_in_Java.Practice.Arrays.L3Hard;

import java.util.HashMap;

public class Largest_Subarray_With_Sum_0 {
    public static int maxLen(int arr[], int n) {
        HashMap<Integer,Integer> map = new HashMap<>();//sum-index pair
        int sum =0;
        int maxCount = 0;
        map.put(0,-1);
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }else {
                //same sum already exists in the hashmap
                int count = i-map.get(sum);
                maxCount=Math.max(count,maxCount);
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int [] arr = {15,-2,2,-8,1,7,10,23};
        int n = 8;
        int [] arr2 = {2,10,4};
        int n2 = 3;
        int [] arr3 = {1, 0, -4, 3, 1, 0};
        int n3 = 6;
        int [] arr4 = {-1, 1,-1,1};
        int n4 = 4;
        System.out.println(maxLen(arr,n));
        System.out.println(maxLen(arr2,n2));
        System.out.println(maxLen(arr3,n3));
        System.out.println(maxLen(arr4,n4));
    }
}
