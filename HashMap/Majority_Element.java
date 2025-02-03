package DSA_in_Java.HashMap;
import java.util.*;
public class Majority_Element {
        static int majorityElement(int[] nums) {
            int ans = 0;
            float n = nums.length;
            HashMap<Integer,Integer> map= new HashMap<>();
            for (int num : nums){
                if (map.containsKey(num)){
                    map.put(num , map.get(num)+1);
                }else {
                    map.put(num,1);
                }
            }
            for (int key: map.keySet()){
                if (map.get(key)>n/3){
                    ans = key;
                    return ans;
                }
            }
            return -1;
        }
    public static void main(String[] args) {
        int []nums={1, 3, 2, 5, 1, 3, 1, 5, 1};
        int []arr={1,2};
        int []arr2={6,6,6,7,7};
        System.out.println(majorityElement(nums));
        System.out.println(majorityElement(arr));
        System.out.println(majorityElement(arr2));
    }
}
