package DSA_in_Java.Arrays;

import java.util.Scanner;

public class Ceiling_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {2, 4, 7, 10, 15, 18, 20, 25};
        System.out.print("Enter the no to ceil: ");
        int target = in.nextInt();
        int ans= Ceil(arr,target);
        System.out.println("The ceil value of "+target+" is "+ans);
    }
    static int Ceil(int [] arr , int target){
        int start;
        start = 0;
        int end = arr.length - 1 ;
        if(target>arr[end]){
            return -1;
        }
        while(start<=end){
            int mid = start +( (end - start )/2);
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end = mid-1;
            }else{
                return arr[mid];
            }
        }
        return arr[start];
    }
}
