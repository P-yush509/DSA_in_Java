package DSA_in_Java.Practice.Bit_Manipulation.Level2;

import java.util.Arrays;

public class Single_number3 {
    public static int[] twoOddNum(int Arr[], int N){
        int xor_of_nos = 0;
        for (int i = 0; i < N; i++) {
            xor_of_nos ^= Arr[i];
        }

        int rightmost_set_bit = (xor_of_nos & (xor_of_nos-1)) ^ xor_of_nos;

        int bucket_0 = 0;
        int bucket_1 = 0;
        for (int i = 0; i < N; i++) {
            if ((Arr[i] & rightmost_set_bit)>0){
                bucket_1 ^= Arr[i];
            }else {
                bucket_0 ^= Arr[i];
            }
        }
        return new int[] {bucket_0,bucket_1};
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 3, 1};
        int n = 8 ;
        System.out.println(Arrays.toString(twoOddNum(arr,n)));

        int[] arr2 = {1,7,5,7,5,4,7,4};
        int n2 = 8 ;
        System.out.println(Arrays.toString(twoOddNum(arr2,n2)));

        int[] arr3 = {1,2,1,3,2,5};
        int n3 = 6 ;
        System.out.println(Arrays.toString(twoOddNum(arr3,n3)));

        int[] arr4 = {-1,0};
        int n4 = 2 ;
        System.out.println(Arrays.toString(twoOddNum(arr4,n4)));

        int[] arr5 = {0,1};
        int n5 = 2 ;
        System.out.println(Arrays.toString(twoOddNum(arr5,n5)));
    }
}
