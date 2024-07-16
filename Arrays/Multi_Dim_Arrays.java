package DSA_in_Java;

public class Multi_Dim_Arrays {
    public static void main(String[] args) {
         int[][] Arr2D={
                 {1,2,3},
                 {4,5},
                 {6,7,8,9}
         };
         for(int row =0;row<Arr2D.length;row++){
             for(int col=0; col<Arr2D[row].length;col++){
                    System.out.print(Arr2D[row][col] + " ");

             }
             System.out.println();
         }
    }
}
