package DSA_in_Java.Recursion.Rec_L4_PrevSortByRec;

public class Patterns {
    public static void main(String[] args) {
        Triangle1(4,0);

//        * * * *
//        * * *
//        * *
//        *
        System.out.println();
        Triangle2(4,0,0);
//        *
//        * *
//        * * *
//        * * * *

    }

    static void Triangle1(int row, int col){
        if(row==0){
            return;
        }
        if(col==row){
            System.out.println();
            Triangle1(row-1,0);
        }else{
            System.out.print("* ");
            Triangle1(row,col+1);
        }
    }

    static void Triangle2(int n ,int row, int col){
        if(row==n){
            return;
        }
        if(col>row){
            System.out.println();
            Triangle2(n,row+1,0);
        }else{
            System.out.print("* ");
            Triangle2(n, row,col+1);
        }
    }
}
