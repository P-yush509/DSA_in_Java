package DSA_in_Java.Bitwise_operator;

public class Find_unique {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1,7,3};
        System.out.println(unique_in_array(arr));
    }
    static int unique_in_array(int[] arr){
        int ans =0;
        for (int i=0;i<arr.length;i++){
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
