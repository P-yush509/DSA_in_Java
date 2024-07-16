package DSA_in_Java.Recursion.Rec_L4_PrevSortByRec;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {3,56,78,12,46,7,89,90};
        System.out.println(Arrays.toString(sort(arr,0,0,0)));
    }
    static int[] sort(int[] arr, int i , int j , int k){
        if(i==arr.length){
            return arr;
        }
        if(j== arr.length){
            return sort(arr,i+1,i+1,i+1);
        }else{
            if(arr[j]<arr[k]){
                int temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
            }
                return sort(arr,i , j+1 , k);
        }
    }
}
