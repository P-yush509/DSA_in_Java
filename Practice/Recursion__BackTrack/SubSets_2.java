package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets_2 {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();
        Arrays.sort(nums);
        helperSubsetsWithDup(nums , 0 ,ansList , currList);
        return ansList;
    }

    public static void helperSubsetsWithDup(int[] nums , int starting_index ,List<List<Integer>> ansList , List<Integer> currList){
        // add every subList as at every level of recursion tree , subsets of different length are placed (not like others where ans are generated at the last index only)
        ansList.add(new ArrayList<>(currList));

        for(int i = starting_index; i < nums.length; i++){
            if(i > starting_index && nums[i] == nums[i-1]){  //if a no repeats more than once then take only 1st one at a level and skip others
                continue;
            }
            currList.add(nums[i]);
            helperSubsetsWithDup(nums , i+1 ,ansList , currList);
            currList.remove(currList.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(subsetsWithDup(new int[] {1,2,2}));
        System.out.println(subsetsWithDup(new int[] {0}));
    }
}
