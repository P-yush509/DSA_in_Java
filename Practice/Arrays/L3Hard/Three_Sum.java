package DSA_in_Java.Practice.Arrays.L3Hard;

import java.util.*;

public class Three_Sum {
//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> ansList = new ArrayList<>();
//        List<Integer> triplet = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                for (int k = j+1; k < nums.length ; k++) {
//                    if(nums[i]+nums[j]+nums[k]==0){
//                        triplet.add(nums[i]);
//                        triplet.add(nums[j]);
//                        triplet.add(nums[k]);
//                        Collections.sort(triplet);
//                        if (!ansList.contains(triplet)){
//                            ansList.add(triplet);
//                        }
//                        triplet.clear();
//                    }
//                }
//            }
//        }
//        return ansList;

//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> ansList = new ArrayList<>();
//        List<Integer> triplet = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            HashSet<Integer> set = new HashSet<>(); // need fresh hashmap as the i moves forward
//            for (int j = i + 1; j < nums.length; j++) {
//                int thirdNo = -(nums[i] + nums[j]);
//                if (set.contains(thirdNo)) {
//                    triplet.add(nums[i]);
//                    triplet.add(nums[j]);
//                    triplet.add(thirdNo);
//                    Collections.sort(triplet);
//                    if (!ansList.contains(triplet)) {
//                        ansList.add(triplet);
//                    }
//                    triplet=new ArrayList<>();
//                    triplet.clear();
//                }
//                set.add(nums[j]);
//            }
//        }
//        return ansList;
//    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> triplet;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            while (j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if (sum>0){
                    k--;
                } else if (sum<0) {
                    j++;
                }else {
                    triplet=Arrays.asList(nums[i],nums[j],nums[k]);
                    ansList.add(triplet);
                    k--;
                    j++;
                    while (j<k && nums[j]==nums[j-1]) j++;
                    while (j<k && nums[k]==nums[k+1]) k--;
                }
            }
        }
        return ansList;
    }

    public static void main(String[] args) {
        int []nums = {-1,0,1,2,-1,-4};
        int []nums2 = {0,1,1};
        int []nums3 = {0,0,0};
        System.out.println(threeSum(nums));
        System.out.println(threeSum(nums2));
        System.out.println(threeSum(nums3));
    }
}
