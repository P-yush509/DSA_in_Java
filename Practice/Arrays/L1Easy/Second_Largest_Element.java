package DSA_in_Java.Practice.Arrays.L1Easy;

import java.util.HashMap;

public class Second_Largest_Element {
    public static int getSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE , sec_largest = Integer.MIN_VALUE;
        for (int num : arr){
            if (num > largest){
                sec_largest = largest;
                largest = num;
            }else if (num > sec_largest && num!=largest){
                sec_largest = num;
            }
        }
        return sec_largest==Integer.MIN_VALUE?-1:sec_largest;
    }

    public static void main(String[] args) {
        System.out.println(getSecondLargest(new int[] {12, 35, 1, 10, 34, 1}));
        System.out.println(getSecondLargest(new int[] {10, 5, 10}));
        System.out.println(getSecondLargest(new int[] {10, 10, 10}));
    }
}
