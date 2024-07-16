package DSA_in_Java.Recursion.Rec_L3_Arrays;

import java.util.ArrayList;

public class Multiple_occurrence_in_LS {
    public static void main(String[] args) {
        int [] arr ={1,4,7,4,3,32,44};
        int target=4;
        ArrayList <Integer> lst= new ArrayList<>();
        System.out.println(Search(arr,target,0,lst));
    }
    static ArrayList <Integer> Search(int[] arr, int target ,int index, ArrayList<Integer> lst){
        if(index==arr.length){
            return lst;
        }
        if(arr[index]==target){
            lst.add(index);
        }
        return Search(arr,target,index+1,lst);
    }
}
