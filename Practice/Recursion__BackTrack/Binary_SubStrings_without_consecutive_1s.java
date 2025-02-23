package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.ArrayList;
import java.util.List;

public class Binary_SubStrings_without_consecutive_1s {
    public static List<String> generateBinaryStrings(int n) {
        List<String> list = new ArrayList<>();
        helperGenerateBinaryStrings(n,list,"");
        return list;
    }
    public static void helperGenerateBinaryStrings(int n,List<String> list,String currStr){
        if(currStr.length()==n){
            list.add(currStr);
            return;
        }
        //add 0 to subStr in every case
        helperGenerateBinaryStrings(n,list,currStr+'0');

        //add 1 to subStr if the currStr is empty or if the last char of subStr is 0
        if(currStr.length()==0 || currStr.charAt(currStr.length()-1)!='1'){
            helperGenerateBinaryStrings(n,list,currStr+'1');
        }
    }

    public static void main(String[] args) {
        System.out.println(generateBinaryStrings(3));
        System.out.println(generateBinaryStrings(5));
    }
}
