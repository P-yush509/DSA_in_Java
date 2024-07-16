package DSA_in_Java.Arrays.Sorting;

import java.util.Arrays;

public class Selection_Sorting {
    public static void main(String[] args) {
        int[] arr = {-45,12,75,-6,0,6,89};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection_sort(int [] arr){
        int i , j , k;
        for(i=0; i<arr.length-1; i++){
            for(j=k=i ; j<arr.length; j++){
                if(arr[j]<arr[k]){
                    swap(arr,arr[j],arr[k]);
                }
            }
        }
    }
    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]= temp;
    }
}
