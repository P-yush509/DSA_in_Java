package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.ArrayList;

public class Find_Unique_Binary_String_1980 {

//    TIME LIMIT EXCEEDED

//    public static String findDifferentBinaryString(String[] nums) {
//        int n = nums.length;
//        ArrayList<String> ansList = new ArrayList<>();
//        for(String s: nums){
//            ansList.add(s);
//        }
//        StringBuilder sb = new StringBuilder();
//        backTrack(ansList,sb,n);
//        return ansList.get(ansList.size()-1);
//    }
//
//    public static void backTrack(ArrayList<String> ansList, StringBuilder sb, int n){
//        if(sb.length() == n){
//            if(!ansList.contains(sb.toString())){
//                ansList.add(sb.toString());
//            }
//            return;
//        }
//
//        if(ansList.size() == n+1)   return;
//
//        for(int i = 0; i <= 1; i++){
//            sb.append(i);
//            backTrack(ansList,sb,n);
//            sb.deleteCharAt(sb.length() - 1);
//        }
//    }


    public static String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < nums.length ; i++){
            char ch = (nums[i].charAt(i) == '0') ? '1' :'0';
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(findDifferentBinaryString(new String[] {"01","10"}));
        System.out.println(findDifferentBinaryString(new String[] {"00","01"}));
        System.out.println(findDifferentBinaryString(new String[] {"111","011","001"}));
    }
}
