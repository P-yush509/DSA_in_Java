package DSA_in_Java.Practice.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Array_Leaders {
    public static ArrayList<Integer> leaders(int n, int[] arr) {
        ArrayList<Integer> lst = new ArrayList<>();
        int bigNo = Integer.MIN_VALUE;
        for (int i = n-1; i >= 0; i--) {
               if (arr[i]>=bigNo){
                   bigNo=arr[i];
                   lst.add(bigNo);
               }
        }
        Collections.reverse(lst);
        return lst;
    }

    public static void main(String[] args) {
        int n = 6;
        int []arr = {16,17,4,3,5,2};
        System.out.println(leaders(n,arr));

        int n2 = 5;
        int []arr2 = {10,4,2,4,1};
        System.out.println(leaders(n2,arr2));

        int n3 = 4;
        int[] arr3 = {5, 10, 20, 40};
        System.out.println(leaders(n3,arr3));

        int n4 = 4;
        int []arr4 = {30, 10, 10, 5};
        System.out.println(leaders(n4,arr4));
    }
}
