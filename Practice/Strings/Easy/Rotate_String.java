package DSA_in_Java.Practice.Strings.Easy;

public class Rotate_String {
    public static boolean rotateString(String s, String goal) {
        if (s.length()!=goal.length()){
            return false;
        }
        int size = s.length();
        for (int i = 0; i < size; i++) {
            char first_index = goal.charAt(0);
            String sub_string = goal.substring(1,size);
            String new_word =sub_string+first_index;
            if (new_word.equals(s)){
                return true;
            }
            goal=new_word;
        }
        return false;
    }

//    public static boolean rotateString2(String s, String goal) {
//
//        if(s.length() != goal.length()){
//            return false;
//        }
//        String newString = s + s;
//
//        return newString.contains(goal);
//    }

    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        System.out.println(rotateString(s,goal));

        String s2 = "abcde", goal2 = "abced";
        System.out.println(rotateString(s2,goal2));

        String s3 = "abcde", goal3 = "";
        System.out.println(rotateString(s3,goal3));

        String s4 = "abcde", goal4 = "abcde";
        System.out.println(rotateString(s4,goal4));
    }
}
