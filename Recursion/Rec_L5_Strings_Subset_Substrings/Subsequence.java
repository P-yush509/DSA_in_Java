package DSA_in_Java.Recursion.Rec_L5_Strings_Subset_Substrings;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
//        subsequence("","abc");
        System.out.println(subsequence_ret("","abc"));

    }
    static void subsequence(String pro , String unpro){
        if(unpro.isEmpty()){
            System.out.println(pro);
            return ;
        }
        char ch = unpro.charAt(0);
        subsequence(pro,unpro.substring(1));
        subsequence(pro+ch,unpro.substring(1));
    }

    static ArrayList<String> subsequence_ret(String pro , String unpro){//processed
        if(unpro.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }
        char ch = unpro.charAt(0);
        ArrayList<String> Left = subsequence_ret(pro+ch,unpro.substring(1));
        ArrayList<String> Right = subsequence_ret(pro,unpro.substring(1));
        Left.addAll(Right);
        return Left;
    }

}
