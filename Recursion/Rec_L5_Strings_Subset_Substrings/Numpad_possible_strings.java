package DSA_in_Java.Recursion.Rec_L5_Strings_Subset_Substrings;

import java.util.ArrayList;

public class Numpad_possible_strings {
    public static void main(String[] args) {
        pad("" , "12");
        System.out.println(padList("","12"));
        System.out.println(padCount("" , "12"));
    }


    static void pad(String pro, String unpro){
        if(unpro.isEmpty()){
            System.out.println(pro);
            return;
        }
        int digit= unpro.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3; i++){
            char ch = (char)('a' + i) ;
            pad(pro+ch, unpro.substring(1));
        }
    }

    static ArrayList<String> padList(String pro, String unpro){
        if(unpro.isEmpty()){
            ArrayList<String> lst = new ArrayList<>();
            lst.add(pro);
            return lst;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit= unpro.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3; i++){
            char ch = (char)('a' + i) ;
            ans.addAll(padList(pro+ch, unpro.substring(1)));
        }
        return ans;
    }

    static int padCount(String pro, String unpro){
        if(unpro.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit= unpro.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3; i++){
            char ch = (char)('a' + i) ;
            count = count + padCount(pro+ch, unpro.substring(1));
        }
        return count;
    }
}
