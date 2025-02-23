package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();
        boolean[] isUsed = new boolean[nums.length];
        helperPermute(nums , isUsed , ansList , currList);
        return ansList;
    }

    public static void helperPermute(int[] nums ,boolean[] isUsed , List<List<Integer>> ansList , List<Integer> currList){
        if(currList.size() == nums.length){
            ansList.add(new ArrayList<>(currList));
            return;
        }

        for(int i = 0 ; i<isUsed.length; i++){
            if(isUsed[i])   continue;

            isUsed[i] = true;
            currList.add(nums[i]);
            helperPermute(nums ,isUsed , ansList , currList);
            isUsed[i] = false;
            currList.remove(currList.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(permute(new int[] {1,2,3}));
        System.out.println(permute(new int[] {0,1}));
        System.out.println(permute(new int[] {1}));
    }
}
