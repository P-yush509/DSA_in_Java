package DSA_in_Java.Practice.Strings.Medium;

import java.util.*;

public class Frequency_Sort {
    public static String frequencySort(String s) {
        List<Character>[] arr = new ArrayList[s.length()+1];
        Map<Character,Integer> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        //assigning frequencies to chars in the map
        for (char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        // making an array of LL in which we'll store the char at the index equals to its frequency
        for (char key : map.keySet()){
            if (arr[map.get(key)]==null){
                arr[map.get(key)] = new ArrayList<>();
            }
            arr[map.get(key)].add(key);
        }
        //now traversing the arr backwards and adding the char for the index times in the ans
        for (int i = arr.length-1 ; i>=0 ; i--){
            if (arr[i]!=null){
                for (char ch : arr[i]){
                    for (int j = 0; j < i; j++) {
                        ans.append(ch);
                    }
                }
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));

        String s1 = "cccaaa";
        System.out.println(frequencySort(s1));

        String s2 = "Aabb";
        System.out.println(frequencySort(s2));

        String s3 = "";
        System.out.println(frequencySort(s3));
    }
}
