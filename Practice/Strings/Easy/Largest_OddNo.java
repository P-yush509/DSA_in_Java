package DSA_in_Java.Practice.Strings.Easy;

public class Largest_OddNo {
    public static String largestOddNumber(String num) {
        int last_index = num.length()-1;
        while (last_index>=0){
            if (num.charAt(last_index)%2!=0){
                return num.substring(0,last_index+1);
            }
            last_index--;
        }
        return "";
    }

    public static void main(String[] args) {
        String num = "52";
        System.out.println(largestOddNumber(num));

        String num2 = "4206";
        System.out.println(largestOddNumber(num2));

        String num3 = "35427";
        System.out.println(largestOddNumber(num3));

        String num4 = "";
        System.out.println(largestOddNumber(num4));
    }
}
