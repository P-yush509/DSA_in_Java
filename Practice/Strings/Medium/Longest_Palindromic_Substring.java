package DSA_in_Java.Practice.Strings.Medium;

import java.util.HashMap;
import java.util.Map;

public class Longest_Palindromic_Substring {
    //      TIME LIMIT EXCEEDED
//    public static String longestPalindrome(String s) {
//        Map <String,Integer> map = new HashMap<>();
//        int n = s.length();
//        for (int i = 0; i < n; i++) {
//            for (int j = n-1; j >= i ; j--) {
//                String subString = s.substring(i,j+1);
//                if (isPalindrome(subString)){
//                    map.put(subString,subString.length());
//                }
//            }
//        }
//        int maxLength = 0;
//        for (int length : map.values()){
//            maxLength = Math.max(length,maxLength);
//        }
//        for (String substring : map.keySet()){
//            if (map.get(substring)==maxLength){
//                return substring;
//            }
//        }
//        return null;
//    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        String ansString = "";
        int maxStrLength = 0;

        for (int i = 0; i < n; i++) {
            // Odd-length palindrome (single character as center)
            int leftPtr = i;
            int rightPtr = i;
            while (leftPtr >= 0 && rightPtr < n && s.charAt(leftPtr) == s.charAt(rightPtr)) {
                int strLength = rightPtr - leftPtr + 1;
                if (strLength > maxStrLength) {
                    maxStrLength = strLength;
                    ansString = s.substring(leftPtr, rightPtr + 1);
                }
                leftPtr--;
                rightPtr++;
            }

            // Even-length palindrome (two adjacent characters as center)
            leftPtr = i;
            rightPtr = i + 1;
            while (leftPtr >= 0 && rightPtr < n && s.charAt(leftPtr) == s.charAt(rightPtr)) {
                int strLength = rightPtr - leftPtr + 1;
                if (strLength > maxStrLength) {
                    maxStrLength = strLength;
                    ansString = s.substring(leftPtr, rightPtr + 1);
                }
                leftPtr--;
                rightPtr++;
            }
        }

        return ansString;
    }


    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));

        String s2 = "cbbd";
        System.out.println(longestPalindrome(s2));

        String s3 = "a";
        System.out.println(longestPalindrome(s3));

        String s4 = "babaaad";
        System.out.println(longestPalindrome(s4));

        String s5 = "babaaaad";
        System.out.println(longestPalindrome(s5));
    }
}
