package DSA_in_Java.Practice.Basics;

public class Palindrome_Number {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String str = Integer.toString(x);
        int n = str.length();
        int i =0;
        while (i<n/2){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        int x = 1723271;
        System.out.println(isPalindrome(x));
    }
}
