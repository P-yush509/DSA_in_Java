package DSA_in_Java.Practice.Strings.Easy;

public class Reverse_Words_ofSTR {
    public static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        s=" "+s;        // to ensure that every sentence would have a leading space so that that space would be used in "adding space btwn words in the ansString"
        int last_index = s.length() - 1;
        while (last_index>0){
            while (last_index>0 && s.charAt(last_index)==' '){
                last_index--;
            }
            int word_end = last_index;
            while (s.charAt(last_index)!=' '){
                last_index--;
            }
            ans.append(s.substring(last_index , word_end+1));
        }
        return ans.toString().trim();
    }

    public static void main(String[] args) {
        String s1 = "the sky is blue";
        System.out.println(reverseWords(s1));

        String s2 = "  hello world  ";
        System.out.println(reverseWords(s2));

        String s3 = "a good   example";
        System.out.println(reverseWords(s3));

        String s4 = "   Ram is a good   boy   ";
        System.out.println(reverseWords(s4));
    }
}
