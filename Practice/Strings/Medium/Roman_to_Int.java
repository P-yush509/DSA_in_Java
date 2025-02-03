package DSA_in_Java.Practice.Strings.Medium;

import java.util.LinkedHashMap;
import java.util.Map;

public class Roman_to_Int {
    public static int romanToInt(String s) {
        int size =  s.length();
        char [] charArray = s.toCharArray();
        int ans = 0;
        Map<Character,Integer> romanMap = new LinkedHashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        for (int i = size-1; i >=0 ; i--) {
            int prevIndex = -1 , currIndex = -1;
            if (i+1<size){
                prevIndex = getIndex(romanMap,charArray[i+1]);
            }
            currIndex = getIndex(romanMap,charArray[i]);
            if (currIndex<prevIndex){
                ans-=romanMap.get(charArray[i]);
            }else {
                ans+=romanMap.get(charArray[i]);
            }
        }
        return ans;
    }

    public static int getIndex(Map<Character, Integer> romanMap, char c) {
        int index = 0;
        for (char ch : romanMap.keySet()){
            if (ch==c){
                return index;
            }
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));

        String s2 = "LVIII";
        System.out.println(romanToInt(s2));

        String s3 = "";
        System.out.println(romanToInt(s3));

        String s4 = "MCMXCIV";
        System.out.println(romanToInt(s4));
    }
}
