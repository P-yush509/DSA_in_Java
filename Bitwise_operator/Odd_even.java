package DSA_in_Java.Bitwise_operator;

public class Odd_even {
    public static void main(String[] args) {
        int n =56;
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n ){
        return (n&1)==1;
    }
}
