package DSA_in_Java.Recursion.Rec_L5_Strings_Subset_Substrings;

import java.util.*;

public class Subset_iterative {
    public static void main(String[] args) {
        int[] arr={3,6,9};
        System.out.println(subset(arr));
    }
    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num: arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));//????
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
        }
}
