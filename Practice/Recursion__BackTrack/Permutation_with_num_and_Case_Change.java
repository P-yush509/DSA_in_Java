package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.ArrayList;
import java.util.List;

public class Permutation_with_num_and_Case_Change {

    public static List<String> letterCasePermutation(String s) {
        List<String> ansList = new ArrayList<>();
        backTrack(s , 0 , new StringBuilder() , ansList);
        return ansList;
    }

//    public static void backTrack(String s , int index , StringBuilder sb , List<String> ansList){
//        if(sb.length() == s.length()){
//            String candidate = sb.toString();
//            if(!ansList.contains(candidate)){
//                ansList.add(candidate);
//            }
//            return;
//        }
//
//        for(int i = index; i < s.length() ; i++){
//            char ch = s.charAt(i);
//            if(ch>=0 && ch <= 9)   continue;
//
//            // add LowerCase char
//            sb.append(Character.toLowerCase(ch));
//            backTrack(s , i+1 , sb , ansList);
//            sb.deleteCharAt(sb.length()-1);
//
//            // add UpperCase char
//            sb.append(Character.toUpperCase(ch));
//            backTrack(s , i+1 , sb , ansList);
//            sb.deleteCharAt(sb.length()-1);
//        }
//    }

    public static void backTrack(String s , int index , StringBuilder sb , List<String> ansList){
        if (index == s.length()) {
            ansList.add(sb.toString());  // Add valid permutation
            return;
        }

        char ch = s.charAt(index);

        if (Character.isDigit(ch)) {  // If it's a digit, just add it and move forward
            sb.append(ch);
            backTrack(s, index + 1, sb, ansList);
            sb.deleteCharAt(sb.length() - 1);
        } else {  // If it's a letter, try both cases
            sb.append(Character.toLowerCase(ch));
            backTrack(s, index + 1, sb, ansList);
            sb.deleteCharAt(sb.length() - 1);

            sb.append(Character.toUpperCase(ch));
            backTrack(s, index + 1, sb, ansList);
            sb.deleteCharAt(sb.length() - 1);
        }
    }


        public static void main(String[] args) {
        System.out.println(letterCasePermutation("a1b2"));
        System.out.println(letterCasePermutation("3z4"));
    }
}
