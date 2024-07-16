package DSA_in_Java.Arrays.Sorting;

import java.util.Arrays;

public class Merge_inplace {
    public static void main(String[] args) {
        int[] arr = {22, 5, 6, 7, 8, 33, 66};
        sortInPlace(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sortInPlace(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = s + (e - s) / 2;
        sortInPlace(arr, s, mid);
        sortInPlace(arr, mid + 1, e);
        mergeInPlace(arr, s, mid, e);
    }

    static void mergeInPlace(int[] arr, int s, int mid, int e) {
        int[] ans = new int[e - s + 1];
        int i = s, j = mid + 1, k = 0;
        while (i <= mid && j <= e) {
            if (arr[i] <= arr[j]) {
                ans[k] = arr[i];
                i++;
            } else {
                ans[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            ans[k] = arr[i];
            i++;
            k++;
        }
        while (j <= e) {
            ans[k] = arr[j];
            j++;
            k++;
        }
        for (int x = 0; x < ans.length; x++) {
            arr[s + x] = ans[x];
        }
    }
}
