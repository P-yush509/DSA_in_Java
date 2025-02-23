package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum2 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();
        Arrays.sort(candidates);        // sorting will make easier in removing duplicates and returning ans in sorted way
        helperCombinationSum2(candidates,target,0,currList,ansList);
        return ansList;
    }

    public static void helperCombinationSum2(int[] candidates,int target,int start_index ,List<Integer> currList, List<List<Integer>> ansList){
        if(target == 0){
            ansList.add(new ArrayList<>(currList));
            return;
        }

        // Loop through the candidates starting from 'start_index'
        for(int i = start_index ; i < candidates.length ; i++ ){
            // If the current number is greater than the target, we can break early (because the array is sorted)
            if (candidates[i] > target) {
                break;
            }
            // Skip duplicates: Only process the first occurrence of a number at each level of recursion
            if (i > start_index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            // Add the current number to the tempList and recurse
            currList.add(candidates[i]);
            helperCombinationSum2(candidates,target - candidates[i],i+1, currList , ansList);
            currList.remove(currList.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum2(new int[] {10,1,2,7,6,1,5},8));
        System.out.println(combinationSum2(new int[] {2,5,2,1,2},5));
    }
}
