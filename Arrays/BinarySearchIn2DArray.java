package DSA_in_Java.Arrays;

import java.util.Arrays;

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr= {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println("The Index of target is "+ Arrays.toString(Search(arr, 43)));
    }
    static int [] Search(int [][]arr , int target){
        int r=0;
        int c= arr.length-1;
        while (r<arr.length && c>=0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }else if(arr[r][c]>target){
                c--;
            }else{
                r++;
            }
        }
        return new int[] {-1,-1};

    }
}
