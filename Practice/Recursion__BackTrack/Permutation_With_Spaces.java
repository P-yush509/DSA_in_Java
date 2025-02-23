package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.ArrayList;

public class Permutation_With_Spaces {
    public static ArrayList<String> permutation(String s) {
        ArrayList<String> al = new ArrayList<>();
        helperPermutation(s,"",0,al);
        return al;
    }

    public static void helperPermutation(String s,String currStr,int index,ArrayList<String> al){
        if(index == s.length()){
            currStr = currStr.trim();
            if (!al.contains(currStr)){
                al.add(currStr);
            }
            return;
        }
        currStr += s.charAt(index);
        helperPermutation(s , currStr+" " , index+1 , al);
        helperPermutation(s , currStr , index+1 , al);
    }

    public static void main(String[] args) {
        System.out.println(permutation("ABC"));
    }
}
