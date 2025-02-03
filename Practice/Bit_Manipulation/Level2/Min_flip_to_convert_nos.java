package DSA_in_Java.Practice.Bit_Manipulation.Level2;

public class Min_flip_to_convert_nos {
    public static int minBitFlips(int start, int goal) {
        int count = 0;
        while (start!=0 || goal!=0){
            if ((start&1) != (goal&1)){
                count++;
            }
            start = start>>1;
            goal = goal>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        int start = 10, goal = 7;
        System.out.println(minBitFlips(start,goal));

        int start2 = 0, goal2 = 11;
        System.out.println(minBitFlips(start2,goal2));

        int start3 = 3, goal3 = 4;
        System.out.println(minBitFlips(start3,goal3));


    }
}
