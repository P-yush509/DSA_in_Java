package DSA_in_Java.Recursion.Rec_L5_Strings_Subset_Substrings;

import java.util.ArrayList;

public class Dice_PossibleWays {
    public static void main(String[] args) {
        dice("", 4);
        System.out.println(diceList("",4));
    }
    static void dice(String pro, int target){
        if(target==0){
            System.out.println(pro);
            return;
        }
        for(int i = 1 ; i<=6 & i<= target ;i++){
            dice(pro+i,target-i);
        }
    }

    static ArrayList<String> diceList(String pro, int target){
        if(target==0){
            ArrayList<String> lst = new ArrayList<>();
            lst.add(pro);
            return lst;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1 ; i<=6 & i<= target ;i++){
            ans.addAll(diceList(pro+i,target-i));
        }
        return ans;
    }
}
