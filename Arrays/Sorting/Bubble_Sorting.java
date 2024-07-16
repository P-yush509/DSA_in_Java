package DSA_in_Java.Arrays.Sorting;

import java.util.Arrays;

public class Bubble_Sorting {
    public static void main(String[] args) {
        int[] arr = {5,7,2,9,1,0};
        bubble_sort(arr);
        System.out.println("The sorted array is "+ Arrays.toString(arr));

    }
    static void bubble_sort(int[] arr){
        int n= arr.length;
        boolean swapped;
        for(int i=0;i<n;i++){
            swapped = false;
            for(int j=1;j<n-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(!swapped){  //swapped==false
                break;
            }
        }
        return ;
    }
}
