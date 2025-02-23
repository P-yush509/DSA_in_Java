package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.ArrayList;
import java.util.Collections;

public class SubSet_Sum {
    public static ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        helperSubsetSums(arr , 0 , 0 ,al);
//        Collections.sort(al);
        return al;
    }

    public static void helperSubsetSums(int[] arr, int index ,int currSum, ArrayList<Integer> al){
        if(index == arr.length){
            al.add(currSum);
            return;
        }

        helperSubsetSums(arr , index + 1, currSum + arr[index] ,al);
        helperSubsetSums(arr , index + 1, currSum ,al);
    }

    public static void main(String[] args) {
        System.out.println(subsetSums(new int[] {2, 3}));
        System.out.println(subsetSums(new int[] {1, 2, 1}));
        System.out.println(subsetSums(new int[] {5, 6, 7}));
    }
}
