package DSA_in_Java.Practice.Recursion__BackTrack;

public class Punishment_No {
    public static int punishmentNumber(int n) {
        int result = 0;
        for(int i = 1; i <= n; i++){
            String i2 = Integer.toString(i*i);  //i2 is string val of square of i
            if(isPartition(i2,i,0,0)){
                result += (i*i);
            }
        }
        return result;
    }

    public static boolean isPartition(String i2,int target,int currSum,int index){
        int n = i2.length();
        if(index == n){
            return (currSum == target);
        }
        if(currSum > target){
            return false;
        }

        for(int j = index ; j < n ; j++){
            int val = Integer.parseInt(i2.substring(index,j+1));
            if(isPartition(i2, target , currSum+val , j+1)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(punishmentNumber(10));
        System.out.println(punishmentNumber(37));
    }
}
