package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.ArrayList;
import java.util.List;

public class Permutation_With_Case_Change {
    public static List<String> permutate_Case_Change(int n){
        List<String> ansList = new ArrayList<>();
        backtrack(n , new StringBuilder(), 0 , ansList);
        return ansList;
    }

    public static void backtrack(int n , StringBuilder currStr, int index, List<String> ansList){
        if (currStr.length() == n){
            ansList.add(currStr.toString());
            return;
        }

        for (int i = index; i < n ; i++) {
            //add lowercase char
            currStr.append((char) ('a' + i));
            backtrack(n , currStr, i+1 , ansList);
            currStr.deleteCharAt(currStr.length()-1);

            //add uppercase char
            currStr.append((char) ('A' + i));
            backtrack(n , currStr, i+1 , ansList);
            currStr.deleteCharAt(currStr.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(permutate_Case_Change(2));
        System.out.println(permutate_Case_Change(3));
        System.out.println(permutate_Case_Change(4));
        System.out.println(permutate_Case_Change(5));
    }
}
