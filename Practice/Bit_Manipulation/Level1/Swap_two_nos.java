package DSA_in_Java.Practice.Bit_Manipulation.Level1;

import java.util.ArrayList;
import java.util.List;

public class Swap_two_nos {
    public static List<Integer> get(int a, int b) {
        List<Integer> ans = new ArrayList<>();
        a = a^b;
        b = a^b;
        a = a^b;
        ans.add(a);
        ans.add(b);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(get(13,9));
        System.out.println(get(15,8));
    }
}
