package DSA_in_Java.Recursion.Rec_L6_Backtracking;

import java.util.ArrayList;
//HERE MAZE GOES FROM (0,0) TO (2,2)
public class MazeWithObs {
    public static void main(String[] args) {
        System.out.println(countPath(0,0));
        System.out.println(PathList("" , 0,0));
    }

    static int countPath(int row, int col){
        if(row==1&&col==1){
            return 0;
        }
        if(row==2||col==2){
            return 1;
        }
        int down = countPath(row+1,col);
        int right = countPath(row,col+1);
        return down+right;
    }

    static ArrayList<String> PathList(String pro, int row, int col){
        if(row==2 && col==2){
            ArrayList<String> lst = new ArrayList<>();
            lst.add(pro);
            return lst;
        }
        if(row==1 && col==1){
            return new ArrayList<>();
        }
        ArrayList<String> ans = new ArrayList<>();
        if(row<=2){
            ans.addAll(PathList(pro+"D",row+1,col));
        }
        if(col<=2){
            ans.addAll(PathList(pro+"R",row,col+1));
        }
        return ans;
    }
}
