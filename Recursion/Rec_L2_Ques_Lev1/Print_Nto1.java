package DSA_in_Java.Recursion.Rec_L2_Ques_Lev1;

public class Print_Nto1 {
    public static void main(String[] args) {
        int n = 4;
        fun1(n);
        System.out.println();
        fun2(n);
        System.out.println();
        fun3(n);
    }
    static void fun1(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        fun1(n-1);
    }

    static void fun2(int n){
        if(n==0){
            return;
        }
        fun2(n-1);
        System.out.print(n+" ");
    }

    static void fun3(int n){

        if(n==0){
            return;
        }
        System.out.print(n+" ");
        fun3(n-1);
        System.out.print(n+" ");

    }
}
