package DSA_in_Java.Practice.Binary_Search.OneD;

import java.util.Arrays;

public class Floor_and_Ceil {
    public static int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr);
        int start = 0;
        int end= arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==x){
                return new int[] {arr[mid],arr[mid]};
            } else if (arr[mid]>x) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        if (0 <= start && start < arr.length && 0 <= end && end < arr.length){
            return new int[] {arr[end],arr[start]};
        }else if(start==arr.length){
            return new int[] {arr[end],-1};
        }else if(end==-1){
            return new int[] {-1,arr[start]};
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int []arr = {5, 6, 8, 9, 6, 5, 5, 6};
        int x = 7 ;
        System.out.println(Arrays.toString(getFloorAndCeil(x,arr)));
        int []arr2 = {5, 6, 8, 8, 6, 5, 5, 6};
        int x2 = 10 ;
        System.out.println(Arrays.toString(getFloorAndCeil(x2,arr2)));
    }
}
