package DSA_in_Java.Practice.Two_Pointers;

public class Max_Score_From_Cards {
    public static int maxScore(int[] cardPoints, int k) {
        int l = k-1 , r = cardPoints.length-1;
        int left_sum = 0 , right_sum = 0 , max_points = 0;
        for (int i = 0; i < k; i++) {
            left_sum += cardPoints[i];
        }
        while (l>=0){
            max_points = Math.max(max_points , left_sum + right_sum);
            left_sum -= cardPoints[l--];
            right_sum += cardPoints[r--];
        }
        return Math.max(max_points , left_sum + right_sum);
    }

    public static void main(String[] args) {
        System.out.println(maxScore(new int[] {1,2,3,4,5,6,1} ,3));
        System.out.println(maxScore(new int[] {2,2,2} ,2));
        System.out.println(maxScore(new int[] {9,7,7,9,7,7,9} ,7));
        System.out.println(maxScore(new int[] {9,9,1,1,11,1} ,3));
        System.out.println(maxScore(new int[] {2,3,6,7} ,0));
//        System.out.println(maxScore(new int[] {} ,));
    }
}
