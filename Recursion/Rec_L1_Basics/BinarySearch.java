package DSA_in_Java.Recursion.Rec_L1_Basics;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={5,8,6,3,1};
        Arrays.sort(arr);
        System.out.println(BS(arr,8,0, arr.length-1));
    }
    static int BS(int[] arr, int target , int start , int end){
        if(start>end){
            return -1;
        }
        int mid= start+ (end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return BS(arr, target,mid+1, end);
        }else{
            return BS(arr, target,start, mid-1);
        }
    }
}
