package DSA_in_Java.Bitwise_operator;

public class magic_no {
    public static void main(String[] args) {
        int n= 6;
        System.out.println(n+"th magic no = "+Magic_no(n));

    }
    static int Magic_no(int n){
        int power = 1;
        int base=5;
        int ans=0;
        while(n>0){
            int index_digit = n&1;
            ans= (int) (ans+ (index_digit*Math.pow(base, power)));
            power++;
            n=n>>1;
        }
        return ans;
    }
}
