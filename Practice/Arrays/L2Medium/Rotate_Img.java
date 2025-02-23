package DSA_in_Java.Practice.Arrays.L2Medium;

public class Rotate_Img {
    public static void rotate(int[][] matrix) {
        //transpose(i.e i <--> j)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //Reverse each row
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < (matrix[i].length)/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][matrix[i].length-j-1];
                matrix[i][matrix[i].length-j-1]=temp;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        printMatrix(matrix);

    }
}
