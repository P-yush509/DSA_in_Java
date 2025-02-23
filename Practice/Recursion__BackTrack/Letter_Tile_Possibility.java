package DSA_in_Java.Practice.Recursion__BackTrack;

import java.util.HashSet;

public class Letter_Tile_Possibility {
    public static int numTilePossibilities(String tiles) {
        HashSet<String> hs = new HashSet<>();
        boolean[] isUsed = new boolean[tiles.length()];
        helperNumTilePossibilities( "", tiles , isUsed , hs);
        return hs.size();
    }

    public static void helperNumTilePossibilities(String currStr ,String tiles , boolean[] isUsed ,HashSet<String> hs){
        if (!currStr.isEmpty()){
            hs.add(currStr);
        }

        for (int i = 0; i < tiles.length(); i++){
            if (!isUsed[i]){    // Try every character that hasn’t been used
                isUsed[i] = true;
                helperNumTilePossibilities(currStr+tiles.charAt(i) , tiles , isUsed , hs);
                isUsed[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(numTilePossibilities("AAB"));
        System.out.println(numTilePossibilities("AAABBC"));
        System.out.println(numTilePossibilities("V"));
    }
}
