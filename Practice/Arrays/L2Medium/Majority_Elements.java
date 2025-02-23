package DSA_in_Java.Practice.Arrays.L2Medium;

import java.util.ArrayList;
import java.util.List;

public class Majority_Elements {
//    public static List<Integer> majorityElement(int[] nums) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        List<Integer> ansList = new ArrayList<>();
//        for(int i = 0; i< nums.length;i++){
//            if(map.containsKey(nums[i])){
//                map.put(nums[i], map.get(nums[i])+1);
//            }else {
//                map.put(nums[i],1);
//            }
//        }
//        int level = nums.length/3;
//        for (int key : map.keySet()){
//            if(map.get(key)>level){
//                ansList.add(key);
//            }
//        }
//        return ansList;
//    }

    // As the ansList can max have 2 elements in it,
    // let there will be 2 such elements check for their count during iteration then on ending
    // of loop check back those elements whether they are greater than the required level
    public static List<Integer> majorityElement(int[] nums){
        List<Integer> ansList = new ArrayList<>();
        int count1 = 0 , count2 = 0;
        int element1 = Integer.MIN_VALUE , element2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(count1==0 && nums[i]!=element2){
                element1=nums[i];
                count1++;
            } else if (count2==0 && nums[i]!=element1) {
                element2=nums[i];
                count2++;
            } else if (nums[i]==element1) {
                count1++;
            } else if (nums[i]==element2) {
                count2++;
            }else {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==element1) count1++;
            if(nums[i]==element2) count2++;
        }
        int level = nums.length/3;
        if (count1>level) ansList.add(element1);
        if (count2>level) ansList.add(element2);
        return ansList;
    }
    public static void main(String[] args) {
        int []nums = {3, 2, 3};
        int []nums2 = {1};
        int []nums3 = {1, 2};
        System.out.println(majorityElement(nums));
        System.out.println(majorityElement(nums2));
        System.out.println(majorityElement(nums3));
    }
}
