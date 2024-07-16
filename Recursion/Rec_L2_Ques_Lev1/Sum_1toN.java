package DSA_in_Java.Recursion.Rec_L2_Ques_Lev1;

public class Sum_1toN {
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum_to(n));
    }
    static int sum_to(int n){
        if(n==0){
            return 0;
        }
        return n+ sum_to(n-1);
    }
}
