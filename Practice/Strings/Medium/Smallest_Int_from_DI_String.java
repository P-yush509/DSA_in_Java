package DSA_in_Java.Practice.Strings.Medium;

public class Smallest_Int_from_DI_String {
    public static String smallestNumber(String pattern) {
        int size = pattern.length();
        StringBuilder sb = new StringBuilder();
        boolean[] isUsed = new boolean[size + 2];
        int j = 1;
        for(int i = 0 ; i < size; i++){
            char ch = pattern.charAt(i);
            if(ch=='I'){
                if(!isUsed[j]){
                    isUsed[j] = true;
                    sb.append(j++);
                }
            }else{
                while(i < size && pattern.charAt(i)=='D'){
                    j++;
                    i++;
                }
                while(j>0 && !isUsed[j]){
                    isUsed[j] = true;
                    sb.append(j--);
                }
                while(j==0 || (j < isUsed.length && isUsed[j])){
                    j++;
                }
            }
        }
        for (int i = 1; i < isUsed.length; i++) {
            if (!isUsed[i]){
                sb.append(i);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(smallestNumber("IIIDIDDD"));
        System.out.println(smallestNumber("DDD"));
        System.out.println(smallestNumber("DDDIII"));
    }
}
