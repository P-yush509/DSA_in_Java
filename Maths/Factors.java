package DSA_in_Java.Maths;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n=20;
        factor1(n);
        System.out.println();
        factor2(n);

    }
    static void factor1(int n){
        for (int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" "+n/i+" ");
            }
        }
    }

    static void factor2(int n){
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" ");
                lst.add(n/i);
            }
        }
        for (int i=lst.size()-1; i>=0; i--){
            System.out.print(lst.get(i)+" ");
        }
    }
}
