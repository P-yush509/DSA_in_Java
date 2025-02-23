package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.Arrays;

public class Distanced_Sequence {
    public static int[] constructDistancedSequence(int n) {
        int[] seqArr = new int[(2*n)-1];
        boolean[] isUsed = new boolean[n+1];
        helperConstructDistancedSequence(n , seqArr , isUsed , 0);
        return seqArr;
    }

    private static boolean helperConstructDistancedSequence(int n, int[] seqArr, boolean[] isUsed, int index) {
        if (index >= seqArr.length) {
            return true; // Found valid sequence
        }

        if (seqArr[index] != 0) {
            return helperConstructDistancedSequence(n, seqArr, isUsed, index + 1); // Skip filled positions
        }

        for (int num = n; num >= 1; num--) { // Try largest first for lexicographical order
            if (isUsed[num]) continue;

            int secondIndex = (num == 1) ? index : index + num;

            if (secondIndex < seqArr.length && seqArr[index] == 0 && seqArr[secondIndex] == 0) {
                // Place number
                seqArr[index] = num;
                if (num != 1) seqArr[secondIndex] = num;
                isUsed[num] = true;

                if (helperConstructDistancedSequence(n, seqArr, isUsed, index + 1)) {
                    return true; // Solution found
                }

                // Backtrack (undo placement)
                seqArr[index] = 0;
                if (num != 1) seqArr[secondIndex] = 0;
                isUsed[num] = false;
            }
        }

        return false; // No valid placement
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructDistancedSequence(3)));
        System.out.println(Arrays.toString(constructDistancedSequence(5)));
    }
}
