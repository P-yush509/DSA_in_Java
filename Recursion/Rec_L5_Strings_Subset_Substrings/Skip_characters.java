package DSA_in_Java.Recursion.Rec_L5_Strings_Subset_Substrings;

public class Skip_characters {
    public static void main(String[] args) {
        String str = "Bagharam";
        StringBuilder builder = new StringBuilder();
        char ch = 'a';
        int i=0;
        Skip_char(str,ch,i,builder);
        System.out.println(builder);
    }

    static void Skip_char(String str, char ch, int i, StringBuilder builder) {
        if(i==str.length()){
            return;
        }
        if (str.charAt(i)!=ch){
            builder.append(str.charAt(i));
        }
        Skip_char(str,ch,i+1,builder);
    }

}
