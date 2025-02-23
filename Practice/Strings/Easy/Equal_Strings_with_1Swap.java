package DSA_in_Java.Practice.Strings.Easy;

public class Equal_Strings_with_1Swap {
    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)){
                builder.append(s1.charAt(i));
                builder.append(s2.charAt(i));
            }
        }
        if (builder.length()!=4)    return false;
        else {
            if (builder.charAt(0)==builder.charAt(3) && builder.charAt(1)==builder.charAt(2)){
                return true;
            }else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        String s1 = "bank", s2 = "kanb";
        System.out.println(areAlmostEqual(s1,s2));

        String s3 = "attack", s4 = "defend";
        System.out.println(areAlmostEqual(s3,s4));

        String s5 = "kelb", s6 = "kelb";
        System.out.println(areAlmostEqual(s5,s6));

        System.out.println(areAlmostEqual("abcd", "dcba"));
        System.out.println(areAlmostEqual("aa", "aa"));
        System.out.println(areAlmostEqual("ab", "ba"));
        System.out.println(areAlmostEqual("abcd", "abdc"));
        System.out.println(areAlmostEqual("abcde", "edcba"));
        System.out.println(areAlmostEqual("abcd", "abdc"));
    }
}
