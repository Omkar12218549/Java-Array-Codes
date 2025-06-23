package Array;

import java.util.Scanner;

public class RotationOfArray {
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
        swapping(arr,0, arr.length-1);
        swapping(arr,0,k-1);
        swapping(arr,k, arr.length-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbe rof elelment in the array: ");
        int n=sc.nextInt();
        //initializing the array
        int[] arr=new int[n];
        //reading the elelmnt of the array
        System.out.println("Enter the elemtn of the array: ");
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int k=3;
        reverser(arr,k);
        for(int num:arr){
            System.out.print(num+" ");
        }



    }
}
