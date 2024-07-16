package DSA_in_Java.Recursion.Rec_L6_Backtracking;

import java.util.ArrayList;
//HERE MAZE GOES FROM (3,3) TO (1,1)
public class Maze {
    public static void main(String[] args) {
        System.out.println(countPath(3,3)+" Paths with moves RD");
        System.out.println(PathList("",3,3));
        System.out.println(countPathWithDiagonal(3,3)+" Paths with moves RdD");
        System.out.println(PathListWithDiagonal("",3,3));
//        Path("",3,3);
    }
    static int countPath(int row, int col){
        if(row==1||col==1){
            return 1;
        }
        int left = countPath(row-1,col);
        int right = countPath(row,col-1);
        return left+right;

//        int count = 0;
//        count = count + countPath(row-1,col) + countPath(row,col-1);
//        return count;
    }

    static void Path(String pro, int row, int col){
        if(row==1 && col==1){
            System.out.println(pro);
            return;
        }
        if(row>1){
            Path(pro+"D",row-1,col);
        }
        if(col>1){
            Path(pro+"R",row,col-1);
        }
    }

    static ArrayList<String> PathList(String pro, int row, int col){
        if(row==1 && col==1){
            ArrayList<String> lst = new ArrayList<>();
            lst.add(pro);
            return lst;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(row>1){
            ans.addAll(PathList(pro+"D",row-1,col));
        }
        if(col>1){
            ans.addAll(PathList(pro+"R",row,col-1));
        }
        return ans;
    }

    static int countPathWithDiagonal(int row, int col){
        if(row==1||col==1){
            return 1;
        }
        int down = countPathWithDiagonal(row-1,col);
        int diagonal = countPathWithDiagonal(row-1, col-1);
        int right = countPathWithDiagonal(row,col-1);
        return down+right+diagonal;
    }

    static ArrayList<String> PathListWithDiagonal(String pro, int row, int col){
        if(row==1 && col==1){
            ArrayList<String> lst = new ArrayList<>();
            lst.add(pro);
            return lst;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(row>1 && col>1){
            ans.addAll(PathListWithDiagonal(pro+"d",row-1,col-1));
        }
        if(row>1){
            ans.addAll(PathListWithDiagonal(pro+"D",row-1,col));
        }
        if(col>1){
            ans.addAll(PathListWithDiagonal(pro+"R",row,col-1));
        }
        return ans;
    }

}
