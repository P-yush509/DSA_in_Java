package DSA_in_Java.Arrays.Sorting;

import java.util.Arrays;

public class Insertion_Sorting {
    public static void main(String[] args) {
        int[] arr = {-45,12,75,-6,0,6,89};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion_sort(int[] arr){
        for(int i =1; i<arr.length;i++){
            int j=i-1;
            int x = arr[i];
            while(j>-1 && arr[j]>x){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=x;
        }
    }
}
