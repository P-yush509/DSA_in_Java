package DSA_in_Java.Recursion.Rec_L6_Backtracking;

import java.util.Arrays;

public class MazeWithAlldirn {
    public static void main(String[] args) {
        boolean[][] board={
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        PathListAllDir("", board,0,0);
        int[][] path = new int[board.length][board[0].length];
        PathPrintAllDir("" , board ,0 , 0 ,  path , 1);
    }
    static void PathListAllDir(String pro, boolean[][] maze, int row, int col){
        if(row== maze.length-1 && col==maze[0].length-1){
            System.out.println(pro);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        maze[row][col]=false;
        if(row< maze.length-1){
            PathListAllDir(pro+"D", maze,row+1, col);
        }
        if(col<maze[0].length-1){
            PathListAllDir(pro+"R",maze,row,col+1);
        }
        if(row>0){
            PathListAllDir(pro+"U", maze,row-1,col);
        }
        if(col>0){
            PathListAllDir(pro+"L",maze,row,col-1);
        }
        maze[row][col]=true;
    }

    static void PathPrintAllDir(String pro, boolean[][] maze, int row, int col, int[][] path , int step){
        if(row== maze.length-1 && col==maze[0].length-1){
            path[row][col]=step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
//            System.out.println(pro);
            System.out.println();
            return;
        }
        if(!maze[row][col]){
            return;
        }

        maze[row][col]=false;
        path[row][col]=step;

        if(row< maze.length-1){
            PathPrintAllDir(pro+"D", maze,row+1, col, path, step+1);
        }
        if(col<maze[0].length-1){
            PathPrintAllDir(pro+"R",maze,row,col+1, path, step+1);
        }
        if(row>0){
            PathPrintAllDir(pro+"U", maze,row-1,col, path, step+1);
        }
        if(col>0){
            PathPrintAllDir(pro+"L",maze,row,col-1, path, step+1);
        }
        maze[row][col]=true;
        path[row][col]=0;
    }
}
