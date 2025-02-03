package DSA_in_Java.Practice.Strings.Easy;

import java.util.HashMap;

public class Isomorphic_Strings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char originalChar = s.charAt(i);
            char newChar = t.charAt(i);
            if (!map.containsKey(originalChar)){
                if (!map.containsValue(newChar)){
                    map.put(originalChar,newChar);
                }else {
                    return false;
                }
            }else {//if map already contains the key now check if its replacement is same or different
                char mappedChar = map.get(originalChar);
                if (mappedChar!=newChar){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s,t));

        String s2 = "foo", t2 = "bar";
        System.out.println(isIsomorphic(s2,t2));

        String s3 = "paper", t3 = "title";
        System.out.println(isIsomorphic(s3,t3));

        String s4 = "", t4 = "";
        System.out.println(isIsomorphic(s4,t4));

        String s5 = "egg", t5 = "";
        System.out.println(isIsomorphic(s5,t5));
    }
}
