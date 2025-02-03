package DSA_in_Java.Practice.Binary_Search.onAnswers;

public class Sqrt_by_BS {
    public static long floorSqrt(long n) {
        long ans = 0;
        long start = 1;
        long end = n;
        while (start<=end){
            long mid  = start + (end-start)/2;
            if (mid*mid>n){
                end=mid-1;
            }else {
                ans=mid;
                start=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(floorSqrt(5));
        System.out.println(floorSqrt(4));
    }
}
