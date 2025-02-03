package DSA_in_Java.Practice.Basics;

public class Palindrome_Sentence {
    public static boolean isPalindrome(String s) {
        int ptr1=0;
        int ptr2=s.length()-1;
        s=s.toLowerCase();
        while (ptr1<ptr2){
            char ch1 =s.charAt(ptr1);
            char ch2 =s.charAt(ptr2);
            if (!(ch1>='a' && ch1<='z' || ch1>='0' && ch1<='9')){
                ptr1++;
                continue;
            }
            if (!(ch2>='a' && ch2<='z' || ch2>='0' && ch2<='9')){
                ptr2--;
                continue;
            }
            if (ch1!=ch2){
                return false;
            }
            ptr1++;
            ptr2--;
        }
            return true;
    }
    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
