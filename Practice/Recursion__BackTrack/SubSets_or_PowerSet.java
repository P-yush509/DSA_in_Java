package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.ArrayList;
import java.util.List;

public class SubSets_or_PowerSet {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        helperSubsets(nums, 0 , new ArrayList<>() , ansList);
        return ansList;
    }

    public static void helperSubsets(int[] nums , int index , List<Integer> currList , List<List<Integer>> ansList){
        if(index == nums.length){
            ansList.add(new ArrayList<>(currList));    // creating new List everytime from the prev data before storing to ansList as the ansList contains the reference of currList so if you will update(add/remove) any no to/from currList , the same operation will also be perform on the previously added List on the ansList
            return;
        }
        currList.add(nums[index]);  //added last no
        helperSubsets(nums, index+1 ,currList , ansList);   //case of taking the no

        currList.remove(currList.size() - 1);   //removed last no
        helperSubsets(nums, index+1 ,currList , ansList);    //case of rejecting the no
    }

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{3,1,2}));
        System.out.println(subsets(new int[]{0}));
    }
}
