package DSA_in_Java.Bitwise_operator;

public class set_i_bit {
    public static void main(String[] args) {
        int n = 44;
        int i = 5;
        System.out.println(n+" after setting of "+i+"th bit will be "+set_bit(n ,i));
    }
    static int set_bit(int n, int i){
        return n|(1<<i-1);
    }
}
