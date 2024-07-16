package DSA_in_Java.Recursion.Rec_L5_Strings_Subset_Substrings;

public class Skip_string {
    public static void main(String[] args) {
        String sentence = "Bagha_brought_Apple_iphone_16_from_godown";
        String word="Apple";
        System.out.println(Skip_str(sentence,word));
    }

    static String Skip_str(String sentence,String word) {
        if(sentence.isEmpty()){
            return "";
        }
        if (sentence.startsWith(word)){
            return sentence.substring(word.length());
        }else {
            return sentence.charAt(0) + Skip_str(sentence.substring(1),word);
        }

    }
}
