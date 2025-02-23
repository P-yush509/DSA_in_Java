package DSA_in_Java.Practice.Arrays.L2Medium;

import java.util.ArrayList;

public class Set_Zeros {
    public static void setZeroes(int[][] matrix) {
        ArrayList<Integer> list = findIndex(matrix);
        for (int i = 0; i < list.size(); i=i+2) {
            int row = list.get(i);
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = 0;
            }
        }
        for (int i = 1; i < list.size(); i=i+2) {
            int col = list.get(i);
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = 0;
            }
        }

    }

    public static ArrayList<Integer> findIndex(int[][] matrix){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]==0){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int [][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int [][] matrix2 = {{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
        setZeroes(matrix2);
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
