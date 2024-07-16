package DSA_in_Java.Recursion.Rec_L2_Ques_Lev1;

public class Product_of_digits {
    public static void main(String[] args) {
        int n =5426;
        System.out.println(digit_product(n));
    }
    static int digit_product(int n){
        if(n<=0){
            return 1;
        }
        return n%10 * digit_product(n/10);
    }
}
