package DSA_in_Java.Practice.Strings.Medium;

public class String_to_Integer {
    public static int myAtoi(String s) {
        int n = s.length();
        int index = 0, sign = 1 , result = 0;
        while (index < n && s.charAt(index)==' '){
            index++;
        }
        if (index<n && (s.charAt(index)=='-' || s.charAt(index)=='+')){
            if (s.charAt(index)=='+') sign = 1;
            else if (s.charAt(index)=='-') sign = -1;
            index++;
        }
        while (index < n && '0' <= s.charAt(index) && s.charAt(index) <= '9'){
            int digit = s.charAt(index) - '0'; // subtracts the ASCII value of charAt(index) with ASCii of 0 to get the actual digit in integer form
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result=result*10+digit;
            index++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        String s = "42";
        System.out.println(myAtoi(s));

        String s2 = " -042";
        System.out.println(myAtoi(s2));

        String s3 = "1337c0d3";
        System.out.println(myAtoi(s3));

        String s4 = "0-1";
        System.out.println(myAtoi(s4));

        String s5 = "";
        System.out.println(myAtoi(s5));

        String s6 = "words and 987";
        System.out.println(myAtoi(s6));
    }
}
