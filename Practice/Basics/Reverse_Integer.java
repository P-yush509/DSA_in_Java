package DSA_in_Java.Practice.Basics;

public class Reverse_Integer {
    public static int reverse(int x) {
        int flag;
        if(x>=0){
            flag=0;
        }else{
            flag=1;
            x=Math.abs(x);
        }
        int rev=0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        while(x>0){
            int remainder = x%10;
            if(min/10>rev || rev>max/10){
                return 0;
            }
            rev = rev*10 + remainder;
            x=x/10;
        }
        if(flag==1){
            return -rev;
            }
        else{
            return rev;
        }
    }
    public static void main(String[] args) {
        int x = -123;
        int rev = reverse(x);
        System.out.println(rev);
    }
}
