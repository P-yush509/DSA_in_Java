package DSA_in_Java.Practice.Arrays.L2Medium;

import java.util.Arrays;
import java.util.HashMap;

public class Distinct_Colour_Count_per_query {
    public static int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> ballMap = new HashMap<>();  // Maps ball index to its color
        HashMap<Integer, Integer> freqMap = new HashMap<>();  // Tracks frequency of each color
        int[] ans = new int[queries.length];
        int i = 0;

        for (int[] query : queries) {
            int index = query[0], newColor = query[1];
            if (ballMap.containsKey(index)) {
                int prevColor = ballMap.get(index);
                if (freqMap.get(prevColor) == 1) {
                    freqMap.remove(prevColor);
                } else {
                    freqMap.put(prevColor, freqMap.get(prevColor) - 1);
                }
            }
            ballMap.put(index, newColor);
            freqMap.put(newColor, freqMap.getOrDefault(newColor, 0) + 1);
            ans[i++] = freqMap.size();
        }
        return ans;
    }

    public static void main(String[] args) {
        int limit = 4;
        int[][] queries = {{1,4},{2,5},{1,3},{3,4}};
        System.out.println(Arrays.toString(queryResults(limit, queries)));

        int limit2 = 4;
        int[][] queries2 = {{0,1},{1,2},{2,2},{3,4},{4,5}};
        System.out.println(Arrays.toString(queryResults(limit2, queries2)));
    }
}
