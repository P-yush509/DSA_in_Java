package DSA_in_Java.Recursion.Rec_L2_Ques_Lev1;

public class Palindrome_no {
    public static void main(String[] args) {
        System.out.println(is_palindrome(12121));
    }
    static boolean is_palindrome(int n){
        return n==reverse1(n,0);
    }
    static int reverse1(int n, int reversed){
        if(n==0){
            return reversed;
        }
        int rem=n%10;
        reversed=reversed*10+rem;
        return reverse1(n/10, reversed);
    }
}
