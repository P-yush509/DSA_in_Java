package DSA_in_Java.Practice.Strings.Easy;

import java.util.Arrays;

public class Longest_Common_Prefix {
//    public static String longestCommonPrefix(String[] strs) {
//        StringBuilder ans = new StringBuilder();
//        for (int i = 0; i < strs[0].length(); i++) {
//            char ch = strs[0].charAt(i);
//            for (int j = 0; j < strs.length; j++) {
//                if (strs[j].length()< i+1 || strs[j].charAt(i)!=ch){      //as i(index) is 1 less than length hence "i+1".
//                    return ans.toString();
//                }
//            }
//            ans.append(ch);
//        }
//        return ans.toString();
//    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);      //sorts array in alphabetical order
        int arrSize = strs.length;
        int index = 0;
        while (index<strs[0].length()){
            if (strs[0].charAt(index)==strs[arrSize-1].charAt(index)){
                ans.append(strs[0].charAt(index));
            }else {
                break;
            }
            index++;
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs1));

        String[] strs2 = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs2));

        String[] strs3 = {"flower","","flight"};
        System.out.println(longestCommonPrefix(strs3));

        String[] strs4 = {"flower","flow","flowing"};
        System.out.println(longestCommonPrefix(strs4));

        String[] strs5 = {"cluster","clue","clutch" , "club" , "clumsy"};
        System.out.println(longestCommonPrefix(strs5));
    }
}
