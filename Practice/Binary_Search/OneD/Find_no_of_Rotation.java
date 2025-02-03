package DSA_in_Java.Practice.Binary_Search.OneD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_no_of_Rotation {
    public static int findKRotation(List<Integer> arr) {
        //the index of the smallest element denotes the no of rotation
        int start = 0;
        int end = arr.size()-1;
        while(start<end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) > arr.get(end)) {
                start = mid +1;
            } else {
                end = mid;
            }
        }
        // 'start' will be the index of the smallest element (the pivot)
        return start;
    }

    public static void main(String[] args) {
        Integer[] arr1 ={5, 1, 2, 3, 4};
        List<Integer> list1 = Arrays.asList(arr1);
        System.out.println(findKRotation(list1));

        Integer[] arr2 ={1, 2, 3, 4, 5};
        List<Integer> list2 = Arrays.asList(arr2);
        System.out.println(findKRotation(list2));
    }
}
