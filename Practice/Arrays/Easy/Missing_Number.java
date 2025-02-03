package DSA_in_Java.Practice.Arrays.Easy;

public class Missing_Number {
    public static int missingNumber(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int correct_index= arr[i];
            if(arr[i] <arr.length && arr[i] != arr[correct_index]){
                swap(arr,i,correct_index);
            }
            else{
                i++;
            }
        }
        int j ;
        for(j =0; j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        //CASE 2 [0,1,2,3]  ans=4
        return arr.length;
    }
    static void swap(int [] arr,int first ,int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }

    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(nums));
    }
}
