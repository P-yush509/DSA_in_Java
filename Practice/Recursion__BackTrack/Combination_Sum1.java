package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum1 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();
        helperCombinationSum(candidates , target ,ansList ,currList , 0 , 0);
        return ansList;
    }

    public static void helperCombinationSum(int[] candidates,int target ,List<List<Integer>> ansList ,List<Integer> currList , int currSum , int index){
        if (currSum > target || index == candidates.length){
            return;
        }
        if (currSum == target){
            ansList.add(new ArrayList<>(currList));
            return;
        }
        // add the candidate[i] till currSum exceeds or equals target value
        currList.add(candidates[index]);
        helperCombinationSum(candidates,target,ansList,currList,currSum+candidates[index],index);
        currList.removeLast();      //if the base condition hits then remove the last inserted item

        //recursive call for addition of next element from candidate
        helperCombinationSum(candidates, target, ansList, currList, currSum , index+1);
    }

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2,3,6,7} ,7));
        System.out.println(combinationSum(new int[]{2,3,5} ,8));
        System.out.println(combinationSum(new int[]{2} ,1));
    }
}
