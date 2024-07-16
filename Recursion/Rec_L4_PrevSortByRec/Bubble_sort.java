package DSA_in_Java.Recursion.Rec_L4_PrevSortByRec;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr={3,5,2,6,0,-1};
        System.out.println(Arrays.toString(bubble(arr,0,1)));
    }
    static int[] bubble(int[] arr, int index, int pass){
        if(pass==arr.length){
            return arr;
        }
        if(index==arr.length-1){
            return bubble(arr,0,pass+1);
        }else{
            if(arr[index]>arr[index+1]){
                int temp = arr[index];
                arr[index]=arr[index+1];
                arr[index+1]=temp;
                return bubble(arr,index+1,pass);
            }else{
                return bubble(arr,index+1,pass);
            }
        }

    }
}
