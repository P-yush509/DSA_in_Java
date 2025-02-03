package DSA_in_Java.Practice.Bit_Manipulation.Level1;

public class Set_Rightmost_unset_bit {
    public static int setBit(int n) {
        int mask = 1;
        while((n & mask)>0){
            mask = mask<<1;
        }
        return n|mask;
    }

    public static void main(String[] args) {
        System.out.println(setBit(6));
        System.out.println(setBit(15));
    }
}
