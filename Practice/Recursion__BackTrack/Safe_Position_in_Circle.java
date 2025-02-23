package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Safe_Position_in_Circle {
//    TLE
//    public static int safePos(int n, int k) {
//        int[] nums = new int[n];
//        Arrays.fill(nums,1);
//        return helperSafePos( n , k , 0 , 0 , nums);
//    }
//
//    public static int helperSafePos(int n , int k , int index , int currSum , int[] nums){
//        if (isArraySumEquals1(nums)){
//            return indexOf1(nums) + 1;      //pos = idx + 1
//        }
//
//        while (currSum != k){
//            currSum += nums[index%n];
//            index++;
//        }
//        nums[(index-1)%n] = 0;
//        currSum = 0;
//        return helperSafePos( n , k , (index) % n , currSum , nums);
//    }
//
//    private static int indexOf1(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 1)
//                return i;
//        }
//        return -1;
//    }
//
//    private static boolean isArraySumEquals1(int[] nums) {
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//            if (sum > 1)    return false;
//        }
//        return sum == 1;
//    }

    public static int safePos(int n, int k) {
        List<Integer> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            people.add(i + 1);  //store index of people
        }
        return helperSafePos(people, k, 0);
    }

    public static int helperSafePos(List<Integer> people, int k, int index) {
        if (people.size() == 1) {
            return people.get(0); // Last person will remain alive
        }

        int indexInList = (index + k - 1) % people.size(); // index of next person to eliminate
        people.remove(indexInList);
        return helperSafePos(people, k, indexInList);
    }

    public static void main(String[] args) {
        System.out.println(safePos(2,1));
        System.out.println(safePos(4,2));
        System.out.println(safePos(5,3));
        System.out.println(safePos(6,2));
        System.out.println(safePos(7,3));
        System.out.println(safePos(10,4));
        System.out.println(safePos(1,1));
        System.out.println(safePos(40,7));
    }
}
