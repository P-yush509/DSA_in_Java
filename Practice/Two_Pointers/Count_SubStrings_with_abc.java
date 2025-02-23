package DSA_in_Java.Practice.Two_Pointers;

public class Count_SubStrings_with_abc {
    public static int numberOfSubstrings(String s) {
        int l = 0 , r = 0 , count = 0;
        int[] abc = new int[3];
        while (r < s.length()){
            char ch = s.charAt(r);
            abc[ch - 'a']++;
            while (abc[0] > 0 && abc[1] > 0 && abc[2] > 0){
                count += s.length() - r;
                abc[s.charAt(l) - 'a']--;
                l++;
            }
            r++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("abcabc"));
        System.out.println(numberOfSubstrings("aaacb"));
        System.out.println(numberOfSubstrings("abc"));
        System.out.println(numberOfSubstrings("bbacba"));
        System.out.println(numberOfSubstrings(""));
        System.out.println(numberOfSubstrings("a"));
        System.out.println(numberOfSubstrings("ababcbc"));
        System.out.println(numberOfSubstrings("ccba"));
        System.out.println(numberOfSubstrings("aaaaa"));
        System.out.println(numberOfSubstrings("abcabcabcabcabc"));
    }
}
