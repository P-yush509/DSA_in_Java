package DSA_in_Java.Practice.Stacks_and_Queues.Monotonic_Stack;

public class Maximal_Rectangle_in_Matrix {
    public static int maximalRectangle(char[][] matrix) {
        if (matrix.length==0 || matrix[0].length==0)    return 0;

        int max_area = 0;
        int[][] heights_at_each_level = new int[matrix.length][matrix[0].length];
        for (int col_no = 0; col_no < matrix[0].length; col_no++) {
            int count = 0;
            for (int row_no = 0; row_no < matrix.length; row_no++) {
                count = (matrix[row_no][col_no]== '1') ? ++count : 0;
                heights_at_each_level[row_no][col_no] = count;
            }
        }
        for (int[] mat : heights_at_each_level){
            int curr_area = Largest_Rectangle_in_Histogram.largestRectangleArea(mat);
            max_area = Math.max(max_area , curr_area);
        }
        return max_area;
    }

    public static void main(String[] args) {
        char[][] matrix1 = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(maximalRectangle(matrix1));

        char[][] matrix2 ={{'0'}};
        System.out.println(maximalRectangle(matrix2));

        char[][] matrix3 ={{'1'}};
        System.out.println(maximalRectangle(matrix3));

        char[][] matrix4 = {
                {'1', '1', '1', '1'}
        };
        System.out.println(maximalRectangle(matrix4));

        char[][] matrix5 = {
                {'1'},
                {'1'},
                {'1'},
                {'0'},
                {'1'}
        };
        System.out.println(maximalRectangle(matrix5));

        char[][] matrix6 = {};
        System.out.println(maximalRectangle(matrix6));

        char[][] matrix7 = {
                {'0', '0', '0'},
                {'0', '0', '0'},
                {'0', '0', '0'}
        };
        System.out.println(maximalRectangle(matrix7));

        char[][] matrix8 = {
                {'1', '1', '1'},
                {'1', '1', '1'},
                {'1', '1', '1'}
        };
        System.out.println(maximalRectangle(matrix8));

    }
}
