package DSA_in_Java.Practice.Bit_Manipulation.Level1;

public class Power_of_two {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(3));
        System.out.println(isPowerOfTwo(6));
        System.out.println(isPowerOfTwo(-8));
    }
}
