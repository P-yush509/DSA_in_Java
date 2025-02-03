package DSA_in_Java.Practice.Binary_Search.onAnswers;

import java.util.Arrays;

public class Koko_eating_banana {
    public static int minEatingSpeed(int[] piles, int h) {
        int maxPile = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i]>maxPile) maxPile=piles[i];//found max element
        }
        int low = 1 , ans = -1;
        int high = maxPile;
        while (low<=high){
            int mid = low + (high-low)/2 ;
            int timing = timeToEat(piles,mid);
            if (timing<=h){
                ans = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int timeToEat(int[] piles, int speed) {
        int time = 0;
        for (int i = 0; i < piles.length; i++) {
            time += Math.ceil((double) piles[i] / (double) speed);
        }
        return time;
    }

    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int time = 8;
        System.out.println(minEatingSpeed(piles,time));
        int[] piles2 = {30,11,23,4,20};
        int time2 = 5;
        int time3 = 6;
        System.out.println(minEatingSpeed(piles2,time2));
        System.out.println(minEatingSpeed(piles2,time3));
        int[] piles3 = {805306368,805306368,805306368};
        int time4 = 1000000000;
        System.out.println(minEatingSpeed(piles3,time4));

    }
}
