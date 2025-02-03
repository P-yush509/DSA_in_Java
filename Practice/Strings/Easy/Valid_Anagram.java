package DSA_in_Java.Practice.Strings.Easy;

import java.util.HashMap;

public class Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
        int size1 = s.length();
        int size2 = t.length();
        if (size1!=size2)      return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for (int i = 0; i < size1; i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (map1.containsKey(ch1)){
                map1.put(ch1,map1.get(ch1)+1);
            }else {
                map1.put(ch1,1);
            }

            if (map2.containsKey(ch2)){
                map2.put(ch2,map2.get(ch2)+1);
            }else {
                map2.put(ch2,1);
            }
        }
        return map1.equals(map2);
//        return (map1.keySet()==map2.keySet() && map1.values()==map2.values());
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));

        String s2 = "rat", t2 = "car";
        System.out.println(isAnagram(s2,t2));

        String s3 = "anagram", t3 = "";
        System.out.println(isAnagram(s3,t3));

        String s4 = "papaya", t4 = "apypaa";
        System.out.println(isAnagram(s4,t4));
    }
}
