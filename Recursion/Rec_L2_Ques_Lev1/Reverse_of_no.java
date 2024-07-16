package DSA_in_Java.Recursion.Rec_L2_Ques_Lev1;

public class Reverse_of_no {
    public static void main(String[] args) {
        System.out.println(reverse1(3425,0));
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
