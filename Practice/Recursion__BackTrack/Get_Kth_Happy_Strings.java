package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.ArrayList;
import java.util.List;

public class Get_Kth_Happy_Strings {
    public static String getHappyString(int n, int k) {
        List<String> happyStrings = new ArrayList<>();
        StringBuilder currStr = new StringBuilder();
        helperGetHappyString(n, currStr , happyStrings);
        return k > happyStrings.size() ? "" : happyStrings.get(k - 1);
    }

    private static void helperGetHappyString(int n, StringBuilder currStr, List<String> happyStrings) {
        if (currStr.length() == n) {
            happyStrings.add(currStr.toString());
            return;
        }

        for (char ch : new char[]{'a', 'b', 'c'}) {
            if (currStr.isEmpty() || currStr.charAt(currStr.length() - 1) != ch) {
                currStr.append(ch);
                helperGetHappyString(n, currStr, happyStrings);
                currStr.deleteCharAt(currStr.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(getHappyString(1,3));
        System.out.println(getHappyString(1,4));
        System.out.println(getHappyString(3,9));
    }
}
