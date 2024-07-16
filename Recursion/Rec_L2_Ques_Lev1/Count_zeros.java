package DSA_in_Java.Recursion.Rec_L2_Ques_Lev1;

public class Count_zeros {
    public static void main(String[] args) {
        int n = 909000;
        count_zero(n);
        System.out.println(total);
        System.out.println(count(n,0));
    }
    static int total =0;

    static void count_zero(int n){
        if(n<=0){
            return ;
        }
        if(n%10==0){
            total++;
        }
        count_zero(n/10);
    }

    static int count(int n , int cou){
        if(n==0){
            return cou;
        }
        if(n%10==0){
            return count(n/10, cou+1);
        }
        return count(n/10, cou);
    }
}
