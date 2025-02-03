package DSA_in_Java.Practice.Arrays;

import OOPs.AccessModifiers.A;

import java.util.Arrays;

public class Merge_Sorted_Arrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m , j = 0 ; i < m+n && j<n; i++ , j++) {
            nums1[i]=nums2[j];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 ={1,2,3,0,0,0};
        int[] nums2 ={2,5,6};
        int m =3 , n=3;
        merge(nums1 , m , nums2 , n);
        System.out.println(Arrays.toString(nums1));

        int[] nums3 ={1};
        int[] nums4 ={};
        int m2 =1 , n2=0;
        merge(nums3 , m2 , nums4 , n2);
        System.out.println(Arrays.toString(nums3));

        int[] nums5 ={0};
        int[] nums6 ={1};
        int m3 =0 , n3=1;
        merge(nums5 , m3 , nums6 , n3);
        System.out.println(Arrays.toString(nums5));
    }
}
