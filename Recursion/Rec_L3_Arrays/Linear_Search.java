package DSA_in_Java.Recursion.Rec_L3_Arrays;

public class Linear_Search {
    public static void main(String[] args) {
        int [] arr ={1,46,7,4,3,32,44};
        int target=46;
        System.out.println(Search(arr,target,0));
    }
    static int Search(int[] arr, int target ,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return Search(arr,target,index+1);
    }
}
