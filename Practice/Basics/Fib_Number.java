package DSA_in_Java.Practice.Basics;

public class Fib_Number {
    public static int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int n = 30;
        System.out.println(fib(n));
    }
}
