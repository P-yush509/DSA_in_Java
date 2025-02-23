package DSA_in_Java.Practice.Arrays.L3Hard;

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle {

    public static int findNo(int row , int col){
//        Value at given index is calculated by (row-1)C(col-1) [C->combination]
        row--;
        col--;
        int numerator = 1;
        int denumerator = 1;
        for (int i = 0; i < col; i++) {
            numerator = numerator * (row-i);
           denumerator = denumerator * (i+1);
        }
        return numerator/denumerator;
    }

    public static List<Integer> generateRow (int row){
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for (int col = 1; col < row ; col++) {
            ans=ans*(row-col);
            ans=ans/col;
            ansRow.add((int) ans);
        }
        return ansRow;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ansList = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            ansList.add(generateRow(i));
        }
        return ansList;
    }

    public static void main(String[] args) {
        System.out.println(findNo(5,3));
        System.out.println(generateRow(5));
        System.out.println(generate(6));

    }
}
