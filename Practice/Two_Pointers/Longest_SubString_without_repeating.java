package DSA_in_Java.Practice.Two_Pointers;

import java.util.HashMap;

public class Longest_SubString_without_repeating {
//    public static int lengthOfLongestSubstring(String s) {
//        int n = s.length();
//        if (n==0 || n==1)   return n;
//        HashMap<Character,Integer> map = new HashMap<>();
//        int max_length = 1;
//        for (int i = 0; i < n; i++) {
//            char ch1 = s.charAt(i);
//            map.put(ch1,1);
//            int curr_length = 1;
//            for (int j = i+1; j < n; j++) {
//                char ch2 = s.charAt(j);
//                if (!map.containsKey(ch2)){
//                    map.put(ch2,1);
//                    curr_length++;
//                }else {
//                    map.clear();
//                    break;
//                }
//                max_length = Math.max(curr_length,max_length);
//            }
//        }
//        return max_length;
//    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n==0 || n==1)   return n;
        HashMap<Character,Integer> map = new HashMap<>();
        int max_length = 1;
        int starting_index = 0, ending_index = 0;
        while (ending_index < n) {
            char ch = s.charAt(ending_index);
            if (map.containsKey(ch) && map.get(ch) >= starting_index){
                starting_index = map.get(ch)+1;
            }
            map.put(ch,ending_index);
            int curr_length = ending_index - starting_index + 1;
            max_length = Math.max(curr_length,max_length);
            ending_index++;
        }
        return max_length;
    }

        public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring(""));
        System.out.println(lengthOfLongestSubstring(" "));
        System.out.println(lengthOfLongestSubstring("abcdef"));
        System.out.println(lengthOfLongestSubstring("aa"));
        System.out.println(lengthOfLongestSubstring("abba"));
        System.out.println(lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
    }
}
