package DSA_in_Java.Recursion.Rec_L3_Arrays;

public class Is_Array_Sorted {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4};
        System.out.println(is_sorted(arr,0));
    }
    static boolean is_sorted(int [] arr,int index){
        if(index== arr.length-1){
            return true;
        }
        if(arr[index]<=arr[index+1]){
            return is_sorted(arr,index+1);
        }
        return false;
    }
}
