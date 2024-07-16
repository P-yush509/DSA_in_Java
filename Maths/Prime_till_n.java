package DSA_in_Java.Maths;

public class Prime_till_n {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        for(int i=2;i<n;i++) primes[i] = true;

        sieve(n,primes);
    }
//    The sieve of Eratosthenes is one of the most efficient ways to find all primes smaller than n
    static void sieve(int n, boolean[] primes){
        for (int i =2;i*i<=n;i++){
            if(primes[i]){
                for (int j =i*i;j<=n;j+=i){
                    primes[j]=false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(primes[i]){
                System.out.print(i+" ");
            }
        }
    }
}
