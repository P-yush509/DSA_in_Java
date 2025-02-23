package DSA_in_Java.Practice.Two_Pointers;

import java.util.HashMap;

public class Longest_Subarray_with_2_nos {
    public static int totalElements(Integer[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        int starting_index = 0 , ending_index = 0;
        int max_length = 0 , curr_length = 0;
        while (ending_index < n) {
            map.put(arr[ending_index],ending_index);
            if (map.size()<=2){     //map size will become 3 only when it encounters 3rd distinct no
                curr_length++;
            }else {
                int smallest_val = n , smallest_key = 0 ;
                for (int key : map.keySet()){
                    if (map.get(key)<smallest_val){
                        smallest_val = map.get(key);
                        smallest_key = key;
                    }
                }
                map.remove(smallest_key);
                starting_index = smallest_val + 1;
                curr_length = ending_index - starting_index + 1;
            }
            max_length = Math.max(curr_length,max_length);
            ending_index++;
        }
        return max_length;
    }

    public static void main(String[] args) {
        System.out.println(totalElements(new Integer[]{2, 1, 2}));
        System.out.println(totalElements(new Integer[]{3, 1, 2, 2, 2, 2}));
        System.out.println(totalElements(new Integer[]{1,0,0,1,2,3,4,9}));
        System.out.println(totalElements(new Integer[]{1,1,1,1,1,1,1,0}));
        System.out.println(totalElements(new Integer[]{}));
        System.out.println(totalElements(new Integer[]{9}));
        System.out.println(totalElements(new Integer[]{3,3,1,1,1,3,3,2,2,2,2,2,2,2}));
    }
}
