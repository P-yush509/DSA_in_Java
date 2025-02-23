package DSA_in_Java.Practice.Arrays.L2Medium;

import java.util.Arrays;
import java.util.Comparator;

public class Min_Arrows_to_Burst_Balloons {
    public static int findMinArrowShots(int[][] points) {
        int n = points.length;
        if(n == 1)  return 1;

        Arrays.sort(points, new Comparator<int []>(){
            public int compare(int[] a1 , int[] a2){
                //we have to sort acc to starting index
                if(a1[0] == a2[0])  return 0;
                if(a1[0] < a2[0])  return -1;
                return 1;
            }
        });

        int arrows = 1;
        int[] commonInterval = points[0];
        for(int i = 0; i < n; i++){
            int currStart = points[i][0];
            int currEnd = points[i][1];
            if(currStart <= commonInterval[1]){ //overlapping situation means more than 1 ballon can be bursted with 1 arrow
                //shrink commonIntervals window
                commonInterval[0] = Math.max(commonInterval[0] , currStart);
                commonInterval[1] = Math.min(commonInterval[1] , currEnd);
            }else{  // when balloons don't overlap, start a new interval
                commonInterval[0] = currStart;
                commonInterval[1] = currEnd;
                arrows++;
            }
        }
        return arrows;
    }

    public static void main(String[] args) {
        System.out.println(findMinArrowShots(new int[][] {{10,16},{2,8},{1,6},{7,12}}));
        System.out.println(findMinArrowShots(new int[][] {{1,2},{3,4},{5,6},{7,8}}));
        System.out.println(findMinArrowShots(new int[][] {{1,2},{2,3},{3,4},{4,5}}));
    }
}
