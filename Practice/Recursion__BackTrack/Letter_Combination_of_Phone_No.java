package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.*;

public class Letter_Combination_of_Phone_No {
    public static List<String> letterCombinations(String digits) {
        List<String> ansList = new ArrayList<>();
        if(digits.isEmpty())    return ansList;
        Map<Integer,List<Character>> map = new HashMap<>();

        map.put(2, Arrays.asList('a', 'b', 'c'));
        map.put(3, Arrays.asList('d', 'e', 'f'));
        map.put(4, Arrays.asList('g', 'h', 'i'));
        map.put(5, Arrays.asList('j', 'k', 'l'));
        map.put(6, Arrays.asList('m', 'n', 'o'));
        map.put(7, Arrays.asList('p', 'q', 'r', 's'));
        map.put(8, Arrays.asList('t', 'u', 'v'));
        map.put(9, Arrays.asList('w', 'x', 'y', 'z'));

        backTrack(digits , 0 , ansList , new StringBuilder() , map);
        return ansList;
    }

    public static void backTrack(String digits , int index , List<String> ansList , StringBuilder sb , Map<Integer , List<Character>> map){
        if(index == digits.length()){
            ansList.add(sb.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        List<Character> characters = map.get(digit);

        for(char ch : characters){
            sb.append(ch);
            backTrack(digits , index + 1 , ansList , sb , map);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
        System.out.println(letterCombinations(""));
        System.out.println(letterCombinations("2"));
    }
}
