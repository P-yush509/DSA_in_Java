package DSA_in_Java.Bitwise_operator;

public class PowerofTwo {
    public static void main(String[] args) {
     int n = 64;
        System.out.println(isPowerofTwo(n));
    }
    static boolean isPowerofTwo(int n ){
        if(n==0)return false;
        return (n&(n-1))==0;
    }

}
