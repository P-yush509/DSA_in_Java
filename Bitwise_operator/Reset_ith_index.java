package DSA_in_Java.Bitwise_operator;

public class Reset_ith_index {
    public static void main(String[] args) {
        int n = 44;
        int i = 4;
        System.out.println(n+" after resetting of "+i+"th bit will be "+reset_bit(n ,i));
    }
    static int reset_bit(int n, int i){
//        int mask0=(1<<i-1);//001000
//        int mask1=mask0^1;//110111
        return (n & ~(1<<i-1));
    }
}
