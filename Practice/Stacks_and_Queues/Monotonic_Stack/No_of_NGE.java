package DSA_in_Java.Practice.Stacks_and_Queues.Monotonic_Stack;

import java.util.Arrays;

public class No_of_NGE {
    public static int[] count_NGEs(int N, int []arr, int queries, int []indices) {
        int[] ans = new int[queries];
        for (int i = 0; i < queries; i++) {
            int count = 0;
            for (int j = indices[i]+1 ; j < N ; j++) {
                if (arr[j]>arr[indices[i]]){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 7, 5, 8, 10, 6};
        int[] indices = {0, 5};
        int queries = 2;
        int N = 8;
        System.out.println(Arrays.toString(count_NGEs(N,arr,queries,indices)));

        int[] arr2 = {1, 2, 3, 4, 1};
        int[] indices2 = {0, 3};
        int queries2 = 2;
        int N2 = 5;
        System.out.println(Arrays.toString(count_NGEs(N2,arr2,queries2,indices2)));
    }
}
