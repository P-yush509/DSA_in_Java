package DSA_in_Java.Arrays.Sorting;

import java.util.Arrays;

public class Cycle_Sorting {
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,2};
        cycle_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycle_sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct_index= arr[i]-1;
            if(arr[i] != arr[correct_index]){
                swap(arr,i,correct_index);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int [] arr,int first ,int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }
}
