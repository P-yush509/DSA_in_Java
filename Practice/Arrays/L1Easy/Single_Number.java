package DSA_in_Java.Practice.Arrays.L1Easy;

import java.util.HashMap;

public class Single_Number {
    public static int singleNumber(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for (int num:nums){
            if (map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        for (int key: map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        int[] nums2 = {4,1,2,1,2};
        int[] nums3 = {1};
        System.out.println(singleNumber(nums));
        System.out.println(singleNumber(nums2));
        System.out.println(singleNumber(nums3));
    }
}
