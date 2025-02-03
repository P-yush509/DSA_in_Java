package DSA_in_Java.Practice.Strings.Medium;

public class Nested_Parenthesis_Depth {
    public static int maxDepth(String s) {
        int balance = 0 , max_count = 0;
        for (char ch : s.toCharArray()){
            if (ch=='('){
                balance++;
            }else if (ch==')'){
                balance--;
            }
            max_count=Math.max(max_count,balance);
        }
        return max_count;
    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));

        String s2 = "(1)+((2))+(((3)))";
        System.out.println(maxDepth(s2));

        String s3 = "";
        System.out.println(maxDepth(s3));

        String s4 = "()(())((()()))";
        System.out.println(maxDepth(s4));
    }
}
