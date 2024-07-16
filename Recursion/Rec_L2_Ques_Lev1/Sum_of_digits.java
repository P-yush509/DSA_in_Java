package DSA_in_Java.Recursion.Rec_L2_Ques_Lev1;

public class Sum_of_digits {
    public static void main(String[] args) {
        int n =5026;
        System.out.println(digit_sum(n));
    }
    static int digit_sum(int n){
        if(n<=0){
            return 0;
        }
        return n%10 + digit_sum(n/10);
    }
}
