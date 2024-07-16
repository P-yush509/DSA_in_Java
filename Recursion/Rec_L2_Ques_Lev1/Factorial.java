package DSA_in_Java.Recursion.Rec_L2_Ques_Lev1;

public class Factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
