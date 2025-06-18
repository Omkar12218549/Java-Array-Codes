package PRACTICEE;


import java.util.Arrays;

public class ReversingTheArray {
    public static void reverse(int arr[]){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }


    }

    public static void main(String[] args) {
        int arr[]={1,23,4,5,6,4};
           reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
