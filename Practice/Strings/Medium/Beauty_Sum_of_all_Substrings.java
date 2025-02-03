package DSA_in_Java.Practice.Strings.Medium;

import java.util.HashMap;
import java.util.Map;

public class Beauty_Sum_of_all_Substrings {
//    public static int beautySum(String s) {
//        int n = s.length();
//        int beautySum = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = n-1; j >= i ; j--) {
//                Map<Character,Integer> map = new HashMap<>();
//                String subString = s.substring(i,j+1);
//                for (char ch: subString.toCharArray()){
//                    map.put(ch,map.getOrDefault(ch , 0)+1);
//                }
//                int maxFreq = Integer.MIN_VALUE;
//                int minFreq = Integer.MAX_VALUE;
//                for (char key: map.keySet()){
//                    maxFreq = Math.max(maxFreq,map.get(key));
//                    minFreq = Math.min(minFreq,map.get(key));
//                }
//                beautySum+=(maxFreq-minFreq);
//            }
//        }
//        return beautySum;
//    }

    public static int beautySum(String s) {
        int n = s.length();
        int beautySum = 0;
        for (int i = 0; i < n; i++) {
            int[] freqArray = new int[26];
            for (int j = i; j < n; j++) {
                freqArray[s.charAt(j)-'a']++;
                int maxFreq = Integer.MIN_VALUE , minFreq = Integer.MAX_VALUE;
                for (int f : freqArray){
                    if (f>0){
                        minFreq=Math.min(minFreq,f);
                        maxFreq=Math.max(maxFreq,f);
                    }
                }
                beautySum+=(maxFreq-minFreq);
            }
        }
        return beautySum;
    }

    public static void main(String[] args) {
        String s = "aabcb";
        System.out.println(beautySum(s));

        String s2 = "aabcbaa";
        System.out.println(beautySum(s2));

        String s3 = "";
        System.out.println(beautySum(s3));

        String s4 = "vcdrfffdchvdbhwnvoifkxfchicszovrbeafebxkicbevnmatkkhusxkgytuxopgszuzbqgkoetxjlpyvntvozntxbjumaedmdomqzqiqqlqkxecwptzvzkwddvrrnfjsqbosuxexyiqecexzxwnftqhsqqtcjlokfdglobphkfferqedvuatahxtzyjmgajgmfuvokormpwjagxinwegstolpwsqravzsujnxadyafagibnlwyhutprbepnwppfkaqxrgzkicyplszvhmjwpzcvdojjkzqmdirvuqedltqgilzsfdotumpxyymabqthwipxdnvjidbnbwpcdzxwbqwunlmazstrjnshfajqs";
        System.out.println(beautySum(s4));
    }
}
