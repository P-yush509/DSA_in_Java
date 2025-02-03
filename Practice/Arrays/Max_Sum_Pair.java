package DSA_in_Java.Practice.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Max_Sum_Pair {
    public static int pairWithMaxSum(List<Integer> arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size()-1; i++) {
            int sum = arr.get(i) +arr.get(i+1);
            if (sum>maxSum){
                maxSum=sum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Integer [] arr ={4, 3, 1, 5, 6};
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(pairWithMaxSum(list));

        Integer [] arr2 ={5, 4, 3, 1, 6};
        ArrayList <Integer> list2 = new ArrayList<>(Arrays.asList(arr2));
        System.out.println(pairWithMaxSum(list2));
    }
}
