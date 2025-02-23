package DSA_in_Java.Practice.Two_Pointers;

import java.util.HashMap;

public class Longest_Repeating_Character_Replacement {
    public static int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();     // stores no and freq of that no
        int starting_index = 0 , ending_index = 0;
        int max_length = 0 , curr_length = 0;
        int max_freq_of_key = 0 , no_of_swapping = 0;

        while (ending_index < s.length()){
            char ch = s.charAt(ending_index);
            map.put(ch , map.getOrDefault(ch, 0) +1);

            max_freq_of_key = Math.max(max_freq_of_key , map.get(ch));

            no_of_swapping = (ending_index - starting_index + 1) - max_freq_of_key; //length - max freq of key

            if (no_of_swapping > k){
                char leftChar = s.charAt(starting_index);
                map.put(leftChar , map.get(leftChar)-1);
                starting_index++;
                curr_length--;
            }
            curr_length++;
            max_length = Math.max(max_length , curr_length);
            ending_index++;
        }
        return max_length;
    }

//    WE MAY USE AN ARRAY OF SIZE 26 TO KEEP THE TRACK OF FREQUENCY AND UPDATE IT IN 0(1) TIME
//    public static int characterReplacement(String s, int k) {
//        int[] freq = new int[26]; // Array instead of HashMap
//        int starting_index = 0, ending_index = 0;
//        int max_length = 0, curr_length = 0;
//        int max_freq_of_key = 0, no_of_swapping = 0;
//
//        while (ending_index < s.length()) {
//            char ch = s.charAt(ending_index);
//            freq[ch - 'A']++; // Update frequency in O(1)
//            max_freq_of_key = Math.max(max_freq_of_key, freq[ch - 'A']);
//
//            no_of_swapping = (ending_index - starting_index + 1) - max_freq_of_key;
//
//            if (no_of_swapping > k) {  // Shrink window if needed
//                char leftChar = s.charAt(starting_index);
//                freq[leftChar - 'A']--;
//                starting_index++;
//                curr_length--;
//            }
//
//            curr_length++;
//            max_length = Math.max(max_length, curr_length);
//            ending_index++;
//        }
//
//        return max_length;
//    }


    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB" , 2));
        System.out.println(characterReplacement("AABABBA" , 1));
        System.out.println(characterReplacement("AAAA" ,2));
        System.out.println(characterReplacement("ABCD" ,2));
        System.out.println(characterReplacement("AAAB" ,0));
        System.out.println(characterReplacement("A" ,1));
        System.out.println(characterReplacement("ABABABAB" ,2));
        System.out.println(characterReplacement("AABABBAAABBBBAAABBBBAAABBBB" ,5));
        System.out.println(characterReplacement("ABABABABABABABAB" ,8 ));
        System.out.println(characterReplacement("CAAAAAAAAAAABBBBBB" ,6 ));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append('A');
        }
        String s1 = sb.toString();
        System.out.println(characterReplacement(s1 ,100000 ));
        System.out.println(characterReplacement("ABAA" ,0 ));
    }
}
