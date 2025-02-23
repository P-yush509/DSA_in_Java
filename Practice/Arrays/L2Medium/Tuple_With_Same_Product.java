package DSA_in_Java.Practice.Arrays.L2Medium;

import java.util.HashMap;

public class Tuple_With_Same_Product {
    public static int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                map.put(nums[i]*nums[j] , map.getOrDefault(nums[i]*nums[j] , 0)+1);
            }
        }
        for (int key : map.keySet()){
            if (map.get(key)>=2){
                int combinations = (map.get(key) * (map.get(key)-1)) / 2;   //if we find a product occurring more than twice i.e when we have 3 or more pairs generating same product then we calc all these combinations
                ans += (combinations * 8);  // as for every tuple 8 permutations are possible
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(tupleSameProduct(new int[] {2,3,4,6}));
        System.out.println(tupleSameProduct(new int[] {1,2,4,5,10}));
        System.out.println(tupleSameProduct(new int[] {}));
    }
}
