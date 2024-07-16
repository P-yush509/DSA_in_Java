package DSA_in_Java.Recursion.Rec_L5_Strings_Subset_Substrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetWithDuplicacy {
    public static void main(String[] args) {
        int[] arr = {3, 6, 6};
        System.out.println(subset_with_duplicates(arr));
    }
    static List<List<Integer>> subset_with_duplicates(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for (int i=0;i< arr.length;i++) {
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end= outer.size()-1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));//????
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
