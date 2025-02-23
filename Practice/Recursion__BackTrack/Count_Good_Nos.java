package DSA_in_Java.Practice.Recursion__BackTrack;

public class Count_Good_Nos {
    static int mod = 1000000007;
    public static int countGoodNumbers(long n) {
        //AS EVERY NO HAS SOME EVEN INDICES AND SOME ODD INDICES
        //ON EVEN INDICES WE CAN PUT ONLY EVEN NOS HENCE WE HAVE 5 OPTIONS(0,2,4,6,8)
        //AND ON THE ODD INDICES WE CAN PUT ONLY PRIME NOS HENCE WE HAVE 4 OPTIONS(1,3,5,7)
        //HENCE WE'LL CALCULATE NO OF EVEN AND ODD PLACES IN THE GIVEN "N". AND PUT SUITABLE NO(4/5) AND MULTIPLY THEM
        //i.e. ans = (prime possibilities)^(odd indices) * (even possibilities)^(even indices);
        int even_possibilities = 5;
        int prime_possibilities = 4;
        long odd_indices = n / 2;
        long even_indices = (n / 2) + (n % 2);
        return (int)((power(prime_possibilities,odd_indices) * power(even_possibilities,even_indices)) % mod);
    }

    public static long power(int x , long n){
        if (n==0)   return 1;
        long half = power(x , n/2) % mod;
        if (n%2==0) return (half * half) % mod;
        else    return ((half * half) % mod * x) % mod;
    }

    public static void main(String[] args) {
        System.out.println(countGoodNumbers(1));
        System.out.println(countGoodNumbers(4));
        System.out.println(countGoodNumbers(50));
    }
}
