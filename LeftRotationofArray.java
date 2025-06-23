package Array;

public class LeftRotationofArray {
    public static void swapping(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void reverser(int[] arr,int k){
        k=k% arr.length;
        swapping(arr,0,k-1);
        swapping(arr,k, arr.length-1);
        swapping(arr,0, arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        reverser(arr,k);
        for(int num:arr){
            System.out.print(num+" ");//4567123
        }
    }
}
