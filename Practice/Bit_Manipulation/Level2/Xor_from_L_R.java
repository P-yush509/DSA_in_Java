package DSA_in_Java.Practice.Bit_Manipulation.Level2;

public class Xor_from_L_R {
    public static int findXOR(int l, int r) {
        return xor_1toN(l-1) ^ xor_1toN(r);
    }

    public static int xor_1toN(int n){
        int remainder = n % 4;
        switch (remainder) {
            case 0:
                return n;
            case 1:
                return 1;
            case 2:
                return n + 1;
            case 3:
                return 0;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(findXOR(4 , 8));
        System.out.println(findXOR(4 , 7));
        System.out.println(findXOR(4 , 6));
    }
}
