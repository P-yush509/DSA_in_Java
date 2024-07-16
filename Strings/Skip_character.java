package DSA_in_Java.Strings;

public class Skip_character {
    public static void main(String[] args) {
        String str = "Bagharam";
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)!='a'){
                builder.append(str.charAt(i));
            }
        }
        System.out.println(builder);
    }
}
