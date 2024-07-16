package DSA_in_Java.Pattern_printing;

public class Pattern_Print {
    public static void main(String[] args) {
//        Pattern3(5);
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
//        Pattern4(5);
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//        Pattern5(5);
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
//        Pattern28(5);
//        *
//       * *
//      * * *
//     * * * *
//    * * * * *
//     * * * *
//      * * *
//       * *
//        *
//        Pattern30(5);
//                1
//              2 1 2
//            3 2 1 2 3
//          4 3 2 1 2 3 4
//        5 4 3 2 1 2 3 4 5
//        Pattern17(4);
//           1
//          212
//         32123
//        4321234
//         32123
//          212
//           1
        Pattern31(4);
//        4 4 4 4 4 4 4 4
//        4 3 3 3 3 3 3 4
//        4 3 2 2 2 2 3 4
//        4 3 2 1 1 2 3 4
//        4 3 2 1 1 2 3 4
//        4 3 2 2 2 2 3 4
//        4 3 3 3 3 3 3 4
//        4 4 4 4 4 4 4 4
    }


    static void Pattern3(int n){
        for(int row =1;row<=n;row++){
            for(int col =1;col<=(n-row+1);col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern4(int n){
        for(int row =1;row<=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
     static void Pattern5(int n) {
        for(int row =1;row<=(2*n)-1;row++){
            int ColInRow= row>=n ? 2*n-row: row;
            for(int col =1;col<=ColInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern28(int n) {
        for(int row =1;row<=(2*n)-1;row++){
            int SpaceInRow= row<=n ? n-row :row-n;
            for(int space=1;space<=SpaceInRow;space++){
                System.out.print(" ");
            }
            int ColInRow= row<=n ? row : 2*n-row;
            for(int col =1;col<=ColInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern30(int n) {
        for(int row =1;row<=n;row++){
            int SpaceInRow= 2*(n-row);
            for(int space=1;space<=SpaceInRow;space++){
                System.out.print(" ");
            }
            for(int col =row; col>=1;col--){;
                System.out.print(col+" ");
            }
            for(int col =2;col<=row;col++){;
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void Pattern17(int n) {
        for(int row =1;row<=2*n-1;row++){
            int SpaceInRow= row<=n ? n-row : row-n;
            for(int space=1;space<=SpaceInRow;space++){
                System.out.print(" ");
            }
            int ColInRowStart1= row<=n ? row : 2*n-row;
            int ColInRowEnd1=1;
            for(int col =ColInRowStart1; col>=ColInRowEnd1;col--){
                System.out.print(col);
            }
            int ColInRowStart2= 2;
            int ColInRowEnd2= row<=n ? row : 2*n-row;
            for(int col =ColInRowStart2;col<=ColInRowEnd2;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void Pattern31(int n ){
        for(int row=0;row<=2*n-1;row++){
            for(int col=0;col<=2*n-1;col++){
                //AT MIN DISTANCE FROM ALL THE WALLS
                int AtEveryIndex= Math.min(Math.min(row,2*n-1-row),Math.min(col,2*n-1-col));
                System.out.print(n-AtEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
