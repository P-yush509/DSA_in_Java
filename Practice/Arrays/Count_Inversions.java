package DSA_in_Java.Practice.Arrays;

import java.util.Arrays;

public class Count_Inversions {
    public static long inversionCount(long[] arr) {
        long[] temp = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        int i =0 , j= i ;
        long maxCount = 0;
        while (i< arr.length){
            long count = 0;
            if(arr[i]>temp[j]){
                count++;
                maxCount+=count;
                j++;
            }else {
                i++;
                j=i;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        long[] arr = {2, 4, 1, 3, 5};
        long[] arr2 = {2, 3, 4, 5, 6};
        long[] arr3 = {10, 10, 10};
        long[] arr4 = {24, 18, 38, 43, 14, 40, 1, 54};
        System.out.println(inversionCount(arr));
        System.out.println(inversionCount(arr2));
        System.out.println(inversionCount(arr3));
        System.out.println(inversionCount(arr4));
    }
}
