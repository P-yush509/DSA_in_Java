package DSA_in_Java.Practice.Recursion__BackTrack;

public class Nth_Power_of_X {
    public static double myPow(double x, int n) {
        long pow = n;
        if (pow<0){
            pow = -pow;
            x = 1/x;
        }
        return Pow(x, pow);
    }

    public static double Pow(double x , long n){
        if (n==0)   return 1;
        double half = Pow(x , n/2);
        if (n%2==0) return half * half;
        else    return x * half * half;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000 , 10));
        System.out.println(myPow(2.10000 ,  3));
        System.out.println(myPow(2.00000 , -2));
        System.out.println(myPow(2.00 , -200000000));
        System.out.println(myPow(34.00515 , -3));
    }
}
