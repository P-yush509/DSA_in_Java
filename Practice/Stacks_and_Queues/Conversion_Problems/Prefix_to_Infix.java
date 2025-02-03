package DSA_in_Java.Practice.Stacks_and_Queues.Conversion_Problems;

public class Prefix_to_Infix {
    public static String preToInfix(String pre_exp) {
        StringBuilder rev_pre_exp = new StringBuilder();
        for (int i = pre_exp.length()-1; i >= 0 ; i--) {
            rev_pre_exp.append(pre_exp.charAt(i));
        }
        String rev_ans = Postfix_to_Infix.postToInfix(rev_pre_exp.toString());
        StringBuilder ans = new StringBuilder();
        for (int i = rev_ans.length()-1; i >=0 ; i--) {
            if (rev_ans.charAt(i)=='('){
                ans.append(')');
            } else if (rev_ans.charAt(i) == ')') {
                ans.append('(');
            }else {
                ans.append(rev_ans.charAt(i));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(preToInfix("*-A/BC-/AKL"));
    }
}
