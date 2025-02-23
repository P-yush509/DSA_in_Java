package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.TreeSet;

public class Better_String {
    public static String betterString(String str1, String str2) {
        TreeSet<String> treeset1 = new TreeSet<>();
        TreeSet<String> treeset2 = new TreeSet<>();

        countDistinctSubsequences(treeset1,str1 ,"" ,0);
        int count1 = treeset1.size();

        countDistinctSubsequences(treeset2 ,str2 ,"",0);
        int count2 = treeset2.size();

        if(count1-count2>=0){
            return str1;
        }else{
            return str2;
        }
    }

    public static void countDistinctSubsequences(TreeSet<String> treeset, String str , String currStr , int index){
        if(index == str.length()){
            treeset.add(currStr);
            return;
        }

        countDistinctSubsequences(treeset ,str ,currStr + str.charAt(index), index+1);
        countDistinctSubsequences(treeset ,str ,currStr , index+1);
    }

    public static void main(String[] args) {
        System.out.println(betterString("gfg" ,"ggg"));
        System.out.println(betterString("a" ,"b"));
    }
}
