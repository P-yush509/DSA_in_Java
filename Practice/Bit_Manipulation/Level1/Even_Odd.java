package DSA_in_Java.Practice.Bit_Manipulation.Level1;

public class Even_Odd {
    public static String oddEven(int n) {
        return (n & 1) == 1 ? "odd": "even";
    }

    public static void main(String[] args) {
        System.out.println(oddEven(15));
        System.out.println(oddEven(44));
    }
}
