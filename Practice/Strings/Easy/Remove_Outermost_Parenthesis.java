package DSA_in_Java.Practice.Strings.Easy;

public class Remove_Outermost_Parenthesis {
    public static String removeOuterParentheses(String s) {
        StringBuilder builder = new StringBuilder();
        int start_index = 0;
        int right_cnt = 0;//        (
        int left_cnt = 0;//         )
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='('){
                right_cnt++;
            } else if (s.charAt(i)==')') {
                left_cnt++;
            }
            if (left_cnt==right_cnt){
                builder.append(s.substring(start_index+1 , i));
                right_cnt=left_cnt=0;
                start_index=i+1;
            }
        }
        String ans_string = builder.toString();
        return ans_string;
    }

    public static String removeOuterParentheses2(String s) {
        StringBuilder ans = new StringBuilder();
        int balanced = 0 ;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch=='('){
                if (balanced>0){
                    ans.append(ch);
                }
                balanced++;
            } else{             //ch==')'
                balanced--;
                if (balanced>0){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String str1 = "(()())(())";
        System.out.println(removeOuterParentheses(str1));

        String str2 = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(str2));

        String str3 = "()()";
        System.out.println(removeOuterParentheses(str3));

        String str4 = "";
        System.out.println(removeOuterParentheses(str4));


        String str5 = "(()())(())";
        System.out.println(removeOuterParentheses2(str5));

        String str6 = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses2(str6));

        String str7 = "()()";
        System.out.println(removeOuterParentheses2(str7));

        String str8 = "";
        System.out.println(removeOuterParentheses2(str8));
    }
}
