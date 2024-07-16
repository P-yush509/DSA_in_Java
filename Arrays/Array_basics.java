package DSA_in_Java;

import java.util.Arrays;
import java.util.Scanner;

public class Array_basics {
    static void reverseArray(int[] array){
        int start=0;
        int end = array.length-1;

            while(start<end){
                swap(array,start,end); 
                start++;
                end--;

        }
        System.out.println(Arrays.toString(array));

    }

    static void swap(int[] array,int i, int j) {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the "+ (i+1) +" no.:");
            arr[i]=in.nextInt();
        }
        System.out.println("Array is:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Reverse of Array is: ");
        reverseArray(arr);
    }
}
