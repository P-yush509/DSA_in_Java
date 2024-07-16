package DSA_in_Java.Recursion.Rec_L5_Strings_Subset_Substrings;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        permutation("",str);
        System.out.println(permutationList("",str));
    }
    static void permutation(String pro, String unpro){
        if(unpro.isEmpty()){
            System.out.println(pro);
            return;
        }
        char ch = unpro.charAt(0);
        for (int i = 0 ; i <= pro.length(); i++){
            String fir = pro.substring(0,i);
            String sec = pro.substring(i,pro.length());
            permutation(fir+ch+sec,unpro.substring(1));
        }
    }

    static ArrayList<String> permutationList(String pro, String unpro){
        if(unpro.isEmpty()){
            ArrayList<String> lst = new ArrayList<>();
            lst.add(pro);
            return lst;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = unpro.charAt(0);
        for (int i = 0 ; i <= pro.length(); i++){
            String fir = pro.substring(0,i);
            String sec = pro.substring(i,pro.length());
            ans.addAll(permutationList(fir+ch+sec,unpro.substring(1)));
        }
        return ans;
    }
}
