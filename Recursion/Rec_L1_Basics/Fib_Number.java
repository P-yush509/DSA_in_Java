package DSA_in_Java.Recursion.Rec_L1_Basics;

public class Fib_Number {
    public static void main(String[] args) {
        System.out.println(fib_num(7));
    }
    static int fib_num(int n ){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return fib_num(n-1)+fib_num(n-2);

    }
}
