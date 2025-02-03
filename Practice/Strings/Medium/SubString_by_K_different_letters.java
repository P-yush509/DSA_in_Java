package DSA_in_Java.Practice.Strings.Medium;

public class SubString_by_K_different_letters {
    public static int countSubstr(String str, int k) {
        return -1;
    }

    public static void main(String[] args) {
        String str = "aba";
        int k = 2;
        System.out.println(countSubstr(str,k));

        String str2 = "abaaca";
        int k2 = 1;
        System.out.println(countSubstr(str2,k2));

        String str3 = "cdad";
        int k3 = 4;
        System.out.println(countSubstr(str3,k3));

        String str4 = "";
        int k4 = 2;
        System.out.println(countSubstr(str4,k4));
    }
}
