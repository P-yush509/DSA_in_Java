package DSA_in_Java.Practice.Strings.Medium;

import java.util.Stack;

public class Remove_Occurrences {
//    public static String removeOccurrences(String s, String part) {
//        Stack<Character> stack1 = new Stack<>();
//        Stack<Character> stack2 = new Stack<>();
//        int m = part.length();
//        for(char ch : s.toCharArray()){
//            stack1.push(ch);
//            if(ch == part.charAt(m-1) && stack1.size()>=m){
//                int i = m-1;
//                while(i>=0 && stack1.peek() == part.charAt(i)){
//                    stack2.push(stack1.pop());
//                    i--;
//                }
//                if(i>=0){   // part didn't match completely
//                    while(!stack2.isEmpty()){
//                        stack1.push(stack2.pop());
//                    }
//                }else{
//                    stack2.clear();
//                }
//            }
//        }
//        StringBuilder ans = new StringBuilder();
//        for(char ch : stack1){
//            ans.append(ch);
//        }
//        return ans.toString();
//    }

    public static String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        int m = part.length();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sb.append(ch);
            if (sb.length() >= m && sb.substring(sb.length()-m).equals(part)){  //subString from starting index of last m char
                sb.delete(sb.length()-m, sb.length());      // starting and ending indices for deletion of subString
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(removeOccurrences("daabcbaabcbc" , "abc"));
        System.out.println(removeOccurrences("axxxxyyyyb" , "xy"));
    }
}
