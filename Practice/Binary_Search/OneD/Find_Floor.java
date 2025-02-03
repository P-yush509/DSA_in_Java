package DSA_in_Java.Practice.Binary_Search.OneD;

public class Find_Floor {
    public static int findFloor(long []arr, int n, long x) {
        int start = 0;
        int end=n-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==x){
                return mid;
            } else if (arr[mid]>x) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        long[] arr= {1,2,8,10,11,12,19};
        int n = 7;
        long x1 = 0;
        long x2 = 5;
        long[] arr2= {71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112};
        int n2 = 42;
        long x3 = 68;
        System.out.println(findFloor(arr,n,x1));
        System.out.println(findFloor(arr,n,x2));
        System.out.println(findFloor(arr2,n2,x3));
    }
}
