package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum3 {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();
        helperCombinationSum3(k , n , 1 , 0 , ansList , currList);
        return ansList;
    }

    public static void helperCombinationSum3(int k , int n , int index, int currSum, List<List<Integer>> ansList,List<Integer> currList){
        if(currList.size() == k && currSum == n){
            ansList.add(new ArrayList<>(currList));
            return;
        }

        if(currList.size() > k || currSum > n)  return;     //early pruning un-required cases

        for(int i = index ; i <= 9 ; i++){
            currList.add(i);
            helperCombinationSum3(k , n , i+1 , currSum + i , ansList , currList);
            currList.remove(currList.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum3(3,7));
        System.out.println(combinationSum3(3,9));
        System.out.println(combinationSum3(4,1));
    }
}
