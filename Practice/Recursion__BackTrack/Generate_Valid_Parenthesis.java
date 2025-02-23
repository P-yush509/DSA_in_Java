package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.ArrayList;
import java.util.List;

public class Generate_Valid_Parenthesis {
    public static List<String> generateParenthesis(int n) {
        List<String> ansList = new ArrayList<>();
        backTrack(n , 0 , 0 , new StringBuilder() , ansList);
        return ansList;
    }

    public static void backTrack(int n , int start_count , int end_count , StringBuilder currSeq , List<String> ansList){
        if(start_count == n && end_count == n){
            ansList.add(currSeq.toString());        // no need to check whether the seq is valid or not because we'll add brackets only if condn satisfies
            return;
        }

        if(start_count < n){    // add "(" if count is less than n
            currSeq.append("(");
            backTrack(n ,start_count + 1 , end_count , currSeq , ansList);
            currSeq.deleteCharAt(currSeq.length() - 1);
        }

        if (start_count > end_count){   // add ")" only if opening is greater than closing
            currSeq.append(")");
            backTrack(n ,start_count , end_count + 1 , currSeq , ansList);
            currSeq.deleteCharAt(currSeq.length() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
        System.out.println(generateParenthesis(1));
    }
}
