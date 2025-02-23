package DSA_in_Java.Practice.Arrays.L3Hard;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_Intervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        // Step 1: Sort intervals by the first index
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> ansList = new ArrayList<>();

        // Start with the first interval
        int[] currentInterval = intervals[0];
        ansList.add(currentInterval);

        for (int i = 1; i < intervals.length; i++) {
            int currentEnd = currentInterval[1];
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            // If intervals overlap, merge them by updating the end of currentInterval
            if (currentEnd >= nextStart) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // If no overlap, add the next interval to the list and move to it
                currentInterval = intervals[i];
                ansList.add(currentInterval);
            }
        }

        // Convert the list to a 2D array and return it
        return ansList.toArray(new int[ansList.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] intervals2 = {{1, 4}, {4, 5}};

        // Print the merged intervals using Arrays.deepToString()
        System.out.println(Arrays.deepToString(merge(intervals)));
        System.out.println(Arrays.deepToString(merge(intervals2)));
    }
}
