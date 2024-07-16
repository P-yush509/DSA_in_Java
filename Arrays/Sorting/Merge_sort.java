package DSA_in_Java.Arrays.Sorting;

import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
        int[] arr = {22,5,6,7,8,33,66};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = sort(Arrays.copyOfRange(arr, 0 , mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid ,arr.length)); //as copyOfRange is exclusive

        return merge(left ,right);
    }

    static int[] merge(int[] left, int[] right){
        int[] ans= new int[left.length+ right.length];
        int i =0, j =0, k =0;
        while(i<left.length && j< right.length){
            if(left[i]<right[j]){
                ans[k]=left[i];
                i++;
            }else{
                ans[k]=right[j];
                j++;
            }
            k++;
        }
        while (i< left.length){
            ans[k]=left[i];
            i++;
            k++;
        }
        while(j< right.length){
            ans[k]=right[j];
            j++;
            k++;
        }
        return ans;
    }
}