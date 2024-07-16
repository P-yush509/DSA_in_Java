package DSA_in_Java.Arrays.Sorting;

import java.util.Arrays;

public class Quick_sort {
    public static void main(String[] args) {
        int[] arr ={3,7,53,22,46,89,98,1,0,-1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int low , int high){
        if(low>=high){
            return;
        }
        int s=low;
        int e = high;
        int m = s + (e-s)/2;
        int pivot = arr[m];

        while (s<e){
            while (arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }
            if (s <= e) {
                int temp= arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        //now the pivot is at correct index so sort the 2 halves now
        sort(arr, low , e);
        sort(arr,s,high);
    }
}
