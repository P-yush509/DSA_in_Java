package DSA_in_Java.Practice.Arrays.L2Medium;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Order_Matrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ansList = new ArrayList<>();
        int left = 0 ;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        while (left<=right && top<=bottom){
            for (int i=left; i <= right; i++) {
                ansList.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom ; i++) {
                ansList.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for (int i = right; i >= left ; i--) {
                    ansList.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for (int i = bottom; i >=top ; i--) {
                    ansList.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ansList;
    }

    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
        int [][] matrix2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix2));
    }
}
