package DSA_in_Java.Practice.Arrays.L3Hard;

import java.util.Arrays;
import java.util.HashMap;

public class Missing_and_Repeating {
    public static int[] findTwoElement(int []arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int repeated  = -1;
        int missing= -1;
        for (int num : arr){
            if (map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        for(int key: map.keySet()){
            if(map.get(key)==2){
                repeated = key;
            }
        }

        for (int i = 1; i <= arr.length; i++) {
            if (!map.containsKey(i)){
                missing = i;
            }
        }
        return new int[] {repeated,missing};
    }
    public static void main(String[] args) {
        int[] arr = {2,2};
        int[] arr2 = {1,3,3};
        int[] arr3 = {13, 33, 43 ,16 ,25 ,19 ,23 ,31 ,29 ,35 ,10, 2 ,32 ,11 ,47 ,15, 34, 46, 30, 26, 41, 18, 5 ,17 ,37 ,39 ,6 ,4 ,20 ,27 ,9, 3, 8, 40, 24, 44 ,14 ,36 ,7 ,38 ,12 ,1, 42 ,12 ,28 ,22, 45};
        int[] arr4 = {12, 7, 5, 1, 13, 1, 10, 8, 11, 9, 2, 4, 3, 6};
        System.out.println(Arrays.toString(findTwoElement(arr)));
        System.out.println(Arrays.toString(findTwoElement(arr2)));
        System.out.println(Arrays.toString(findTwoElement(arr3)));
        System.out.println(Arrays.toString(findTwoElement(arr4)));
    }
}
