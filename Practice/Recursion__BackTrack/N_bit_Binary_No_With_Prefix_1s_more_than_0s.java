package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.ArrayList;

public class N_bit_Binary_No_With_Prefix_1s_more_than_0s {
    public static ArrayList<String> NBitBinary(int N) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> ansList = new ArrayList<>();
        backTrack(sb , N , 0 , 0 , ansList);
        return ansList;
    }

    public static void backTrack(StringBuilder sb ,int n , int count0 , int count1 , ArrayList<String> ansList){
        if(sb.length() == n){
            String candidate = sb.toString();
            if(count1 >= count0){
                ansList.add(candidate);
            }
            return;
        }

        sb.append("1");
        backTrack(sb , n , count0 , count1 + 1 , ansList);
        sb.deleteCharAt(sb.length() - 1);

        if(count1 > count0){
            sb.append("0");
            backTrack(sb , n , count0 + 1 , count1 , ansList);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(NBitBinary(2));
        System.out.println(NBitBinary(3));
        System.out.println(NBitBinary(4));
    }
}
