package DSA_in_Java.Bitwise_operator;

public class ith_bit {
    public static void main(String[] args) {
        int num = 44;
        int i = 3;
        System.out.println(ith_bit_of_n(num , i));
    }
    static int ith_bit_of_n(int num, int i){
    return ((num >> i-1)&1);
    }
}
